public class ObjectClass {
    String name;
    int age;
    static String gender;
    public static void main(String [] args){
        // 局部变量只能当前方法中访问，方法结束变量销毁
        String address;
        // 方法中要想使用成员变量，需要先实例化一个对象，才能访问
        ObjectClass obj = new ObjectClass();
        obj.name = "Tom";
        obj.age = 20;
        // 静态变量可以直接访问
        gender = "男";
        System.out.println("成员变量" + obj.name + obj.age + gender);
        System.out.println("类变量（静态变量）" + gender);
        address = "华盛顿";
        System.out.println("局部变量" + address);
    }
}


