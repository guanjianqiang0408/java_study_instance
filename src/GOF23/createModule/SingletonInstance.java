package GOF23.createModule;


import java.util.concurrent.atomic.AtomicReference;

/*
懒汉式 线程不安全
这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式
*/
class SingleTon1{
    private static SingleTon1 instance;
    private SingleTon1(){

    }
    public static SingleTon1 getInstance(){
        if(instance==null){
            instance = new SingleTon1();
        }
        return instance;
    }
}

/*
懒汉式 线程安全
描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
优点：第一次调用才初始化，避免内存浪费。
缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）
*/

class SingleTon2{
    private static SingleTon2 instance;
    private SingleTon2(){};
    public static synchronized SingleTon2 getInstance(){
        if(instance==null){
            instance = new SingleTon2();
        }
        return instance;
    }
}

/*
饿汉式
描述：这种方式比较常用，但容易产生垃圾对象。

优点：没有加锁，执行效率会提高。

缺点：类加载时就初始化，浪费内存。

它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
*/

class SingleTon3{
    private static  SingleTon3 instance = new SingleTon3();

    private SingleTon3(){}

    public static SingleTon3 getInstance(){
        return instance;
    }
}

/*
双检锁/双重校验锁（DCL，即 double-checked locking）
描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。

getInstance() 的性能对应用程序很关键。
*/
class SingleTon4{
    private static SingleTon4 instance;
    private SingleTon4(){}

    public static SingleTon4 getInstance(){
        if(instance==null){
            synchronized (SingleTon4.class){
                if(instance==null){
                    return new SingleTon4();
                }
            }
        }
        return instance;
    }
}

/*
登记式/静态内部类
实现难度：一般

描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。

这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。这个时候，这种方式相比第 3 种方式就显得很合理。
*/

class SingleTon5{
    private static class SingleTonHandler{
        private static final SingleTon5 INSTANCE = new SingleTon5();
    }

    private SingleTon5(){}

    public static SingleTon5 getInstance(){
        return SingleTonHandler.INSTANCE;
    }
}

/*
枚举

描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。

这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。

不能通过 reflection attack 来调用私有构造方法。
*/

enum SingleTon6{
    INSTANCE;
    public void methods(){

    }
}


/*
volatile关键字
描述：对于Double-Check这种可能出现的问题（当然这种概率已经非常小了，但毕竟还是有的嘛~），解决方案是：只需要给instance的声明加上volatile关键字即可volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。注意：volatile阻止的不是singleton = newSingleton()这句话内部[1-2-3]的指令重排，而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
*/
class SingleTon7{
    private static volatile SingleTon7 instance = null;
    private SingleTon7(){}
    public static SingleTon7 getInstance(){
        if(instance==null){
            synchronized (SingleTon7.class){
                if(instance==null){
                    return new SingleTon7();
                }
            }
        }
        return instance;
    }
}

/*
用ThreadLocal实现单例模式（线程安全
描述：ThreadLocal会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突。对于多线程资源共享的问题，同步机制采用了“以时间换空间”的方式，而ThreadLocal采用了“以空间换时间”的方式。前者仅提供一份变量，让不同的线程排队访问，而后者为每一个线程都提供了一份变量，因此可以同时访问而互不影响。
*/

class SingleTon8{
    private static final ThreadLocal<SingleTon8> tlSingleTon = new ThreadLocal<SingleTon8>(){
        protected SingleTon8 initialValue(){
            return new SingleTon8();
        }
    };

    private SingleTon8(){}

    public static SingleTon8 getInstance(){
        return tlSingleTon.get();
    }
}

/*
使用CAS锁实现（线程安全

*/
class SingleTon9{
    private static final AtomicReference<SingleTon9> INSTANCE = new AtomicReference<SingleTon9>();
    private SingleTon9(){}
    public static SingleTon9 getInstance(){
        for(;;){
            SingleTon9 current = INSTANCE.get();
            if(current != null){
                return current;
            }

            current = new SingleTon9();
            if(INSTANCE.compareAndSet(null, current)){
                return current;
            }
        }
    }
}
/*
经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
*/
public class SingletonInstance {
}
