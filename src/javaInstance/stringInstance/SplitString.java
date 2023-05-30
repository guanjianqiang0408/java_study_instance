package javaInstance.stringInstance;

public class SplitString {
    // 字符串分割
    public static void main(String[] args) {
        String string = "www-baidu-com";
        String [] temp;
        // 指定分割标识符
        String delimeter = "-";
        temp = string.split(delimeter);
        // 普通for循环
        for(int i=0; i < temp.length; i ++){
            System.out.println(temp[i]);
            System.out.println("");
        }
        // forEach循环
        for(String item: temp){
            System.out.println(item);
            System.out.println("");
        }
    }
}
