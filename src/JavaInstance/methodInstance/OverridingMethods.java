package JavaInstance.methodInstance;

public class OverridingMethods {
    // 方法覆盖（重写）
    public static void main(String[] args) {
        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(20, 20);
        System.out.println(f.area());
        System.out.println(r.area());
    }
}

class Figure{
    double dim1;
    double dim2;
    // 构造函数
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    // 返回值类型Double
    Double area(){
        System.out.println("Inside area for Figure");
        return (dim1 * dim2);
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    // 重写了Figure area方法
    Double area(){
        System.out.println("Inside area for Rectangle");
        return (dim1 * dim2);
    }
}
