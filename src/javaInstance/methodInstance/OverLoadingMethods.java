package javaInstance.methodInstance;

class MyClass{
    int height;
    MyClass(){
        System.out.println("无参数构造方法");
        height = 4;
    }
    MyClass(int i){
        System.out.println("有参数构造方法");
        height = i;
    }
    void info(){
        System.out.println("房子高:"+height+"米");
    }
    void info(String s){
        System.out.println(s + "房子高:" + height + "米");
    }
}

class OverrideMethods{
    public static void main(String[] args) {
        MyClass m = new MyClass(3);
        m.info();
        m.info("重载方法");
        new MyClass();
    }
}
