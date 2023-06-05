package JavaInstance.stringInstance;

public class SearchString {
    // 字符串查找
    public static void main(String[] args) {
        String string = "Google Runoob Taobao";
        int intIndex = string.indexOf("Runoob");
        if(intIndex == -1){
            System.out.println("没有找到字符串: Runoob");
        }else{
            System.out.println("Runoob 字符串位置: " + intIndex);
        }
    }
}
