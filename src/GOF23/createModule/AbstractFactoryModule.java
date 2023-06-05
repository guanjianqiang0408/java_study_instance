package GOF23.createModule;

// 基础对象类
interface Book{
    void play();
}

class Sanguo implements Book{
    @Override
    public void play() {
        System.out.println("sanguoyanyi");
    }
}

class AnTuSheng implements Book{
    @Override
    public void play() {
        System.out.println("antusheng");
    }
}

interface Phones{
    public void call();
}

class HuaweiPhone implements Phones{
    @Override
    public void call() {
        System.out.println("huawei phone");
    }
}

class XiaoMiPhone implements Phones{
    @Override
    public void call() {
        System.out.println("xiaomi phone");
    }
}

// 超级工厂
interface Factory{
    Phones createPhone();
    Book createBook();
}

// 工厂实现类

// huawei
class HuaweiFactory implements Factory{
    @Override
    public Phones createPhone() {
        return new HuaweiPhone();
    }

    public Book createBook(){
        return new Sanguo();
    }
}

class XiaoMiFactory implements Factory{
    public Phones createPhone(){
        return new XiaoMiPhone();
    }
    public Book createBook(){
        return new AnTuSheng();
    }
}


// 测试工厂类
public class AbstractFactoryModule {
    public static void main(String[] args) {
        Factory f1 = new HuaweiFactory();
        f1.createPhone().call();
        f1.createBook().play();
        Factory f2 = new XiaoMiFactory();
        f2.createPhone().call();
        f2.createBook().play();
    }
}
