package GOF23.createModule;

// 创建House 对应Product产品角色
class House{
    private String basic;
    private String walls;
    private String roofed;

    public String getBasic(){
        return basic;
    }
    public void setBasic(String basic){
        this.basic = basic;
    }
    public String getWalls(){
        return walls;
    }
    public void setWalls(String walls){
        this.walls = walls;
    }
    public String getRoofed(){
        return roofed;
    }
    public void setRoofed(String roofed){
        this.roofed = roofed;
    }
}

// 创建HouseBuilder 对应Builder（抽象建造者）
abstract class HouseBuilder{
    public House house = new House();
    // 将建造流程规制好
    // 地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void roofed();
    // 返回盖好的房子
    public House build(){
        return house;
    }
}

// 创建HighHouse CommentHouse和该类实现方法一直，对应ConcreteBuilder（具体建造者）
class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("high house basic 20 meter");
    }

    @Override
    public void buildWalls() {
        System.out.println("high house wall 50 cm");
    }

    @Override
    public void roofed() {
        System.out.println("high house roofed");
    }
}

class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("common house basic 200 meter");
    }

    @Override
    public void buildWalls() {
        System.out.println("common house wall 500 cm");
    }

    @Override
    public void roofed() {
        System.out.println("common house roofed");
    }
}

// 指挥者
class HouseDirector{
    HouseBuilder houseBuilder = null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder= houseBuilder;
    }
    // 处理盖房流程
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}

public class BuilderModule {
    // 实现
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println("-----");


        HighHouse highHouse = new HighHouse();
        // reset director
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();
    }
}
