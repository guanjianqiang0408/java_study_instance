package GOF23.createModule;

// 工厂接口类
interface Phone{
    void call();
}

// 接口实现类
class Iphone implements Phone{
    public void call(){
        System.out.println("Iphone");
    }
}

class Mphone implements Phone{
    public void call(){
        System.out.println("Mphone");
    }
}

// 一个工厂只负责实现一个接口类
interface PhoneFactory {
    Phone create();
}

class MPhoneFactory implements PhoneFactory{
    public Phone create(){
        System.out.println("mphone");
        return new Mphone();
    }
}

class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        System.out.println("iphone");
        return new Iphone();
    }
}


public class FactoryMethod {
    public static void main(String[] args) {
        MPhoneFactory f1 = new MPhoneFactory();
        f1.create();

        IPhoneFactory f2 = new IPhoneFactory();
        f2.create();
    }
}