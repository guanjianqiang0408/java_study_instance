package GOF23.createModule;


class SingleTon{
    // 创建对象
    private static SingleTon instance = new SingleTon();

    // 构造函数私有化
    private SingleTon(){

    }
    // 获取唯一可用对象
    public static SingleTon getInstance(){
        return instance;
    }

    void show(){
        System.out.println("SingleTon");
    }
}

public class SingletonCase {
    public static void main(String[] args) {
        // 非法的构造参数
        // SingleTon s = new SingleTon();
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
