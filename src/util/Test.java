package util;

public class Test {
    public void hello(){
        System.out.println("hello");
    }
}
// 枚举使用
enum Color{
    RED, BLUE, GREEN
}

class Run{
    public static void main(String[] args) {
        Color col = Color.RED;
        System.out.println(col);
    }
}

// 接口
interface face{
    public void sayType();
    public void saySize();
}

// 继承接口必须要重写接口中的方法
class FeatureFace implements face{
    @Override
    public void sayType(){
        System.out.println("黄皮肤");
    }
    @Override
    public void saySize(){
        System.out.println("24 寸");
    }

    public static void main(String[] args) {
        FeatureFace ff = new FeatureFace();
        ff.sayType();
        ff.saySize();
    }
}