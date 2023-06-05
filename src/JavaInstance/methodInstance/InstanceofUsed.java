package JavaInstance.methodInstance;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceofUsed {
    // 类变量可以直接使用
    static Object to = new ArrayList<>();

    // instanceof使用
    public static void main(String[] args) {
        displayObjectClasss(to);
    }
    public static void displayObjectClasss(Object to){
        if(to instanceof Vector){
            System.out.println("对象是java.util.Vector 实例");
        }else if(to instanceof ArrayList<?>){
            System.out.println("对象是java.util.ArrayList实例");
        }else{
            System.out.println("对象是: " + to.getClass() + " 的实例");
        }
    }
}
