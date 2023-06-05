package JavaInstance.methodInstance;

enum Cars{
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);

    private int price;

    // 构造函数
    Cars(int price){
        this.price = price;
    }
    // 方法
    int getPrice(){
        return price;
    }
}

public class EnumInitialMethodUsed {
    // 枚举的构造函数和方法使用
    public static void main(String[] args) {
        System.out.println("汽车价格");
        for(Cars c: Cars.values()){
            System.out.println(c + "需要" + c.getPrice() + "千美元");
        }
    }
}
