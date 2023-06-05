package JavaInstance.methodInstance;

public class OverloadingUseVarargs {
    // 重载方法中使用varargs参数
    static void test(int ... arr){
        for(int item: arr){
            System.out.println(item);
        }
    }
    static void  test(double ... arr){
        for(double item: arr){
            System.out.println(item);
        }
    }
    static void test(String msg, int ... arr){
        System.out.println(msg);
        for(int item: arr){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        test(new int[]{1,2,3});
        test(new double[]{1.1, 1.2, 1.3});
        test("测试", new int[]{4, 5});
    }
}
