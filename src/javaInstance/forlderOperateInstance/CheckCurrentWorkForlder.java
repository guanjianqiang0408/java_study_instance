package javaInstance.forlderOperateInstance;

public class CheckCurrentWorkForlder {
    // 查看当前工作目录
    public static void main(String[] args) {
        String cd = System.getProperty("user.dir");
        System.out.println("Current dir path: " + cd);
    }
}
