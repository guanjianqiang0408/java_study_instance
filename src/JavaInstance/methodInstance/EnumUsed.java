package JavaInstance.methodInstance;


enum  Car{
    lamborghini,tata,audi,fiat,honda
}
public class EnumUsed {
    // 枚举使用
    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c){
            case lamborghini:
                System.out.println("lamborghini");
                break;
            case tata:
                System.out.println("tata");
                break;
            case audi:
                System.out.println("audi");
                break;
            case fiat:
                System.out.println("fiat");
                break;
            case honda:
                System.out.println("honda");
                break;
            default:
                System.out.println("unknow car type");
        }
    }
}
