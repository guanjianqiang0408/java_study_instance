package GOF23.createModule;

// 测试类
public class SampleFactory {
    public static void main(String[] args) {
        FoodFactroy f = new FoodFactroy();
        String res1 = f.create("huangmenji").toString();
        System.out.println(res1);

        String res2 = f.create("lanzhou").toString();
        System.out.println(res2);
    }
}

//接口类： 定义方法
interface Food{
    public void make();
}

//实现类， 实现接口类的方法
class HuangMenji implements Food{
    public void make(){
        System.out.println("Make HuangMenji fodd");
    }
}

class LanZhouFood implements Food{
    public void make(){
        System.out.println("Make LanZhou Fodd");
    }
}

// 工厂类， 用于生产实现类
class FoodFactroy{
    public Food create(String type){
        if(type.equals("huangmenji")){
            return new HuangMenji();
        } else if (type.equals("lanzhou")) {
            return new LanZhouFood();
        }else{
            return null;
        }
    }
}
