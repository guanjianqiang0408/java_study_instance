package JavaInstance.stringInstance;

// 字符串最后出现的位置
public class StringLastLocal {
    public static void main(String[] args) {
        String str = "Hello World, Hello Runood";
        // 最后出现的索引位置
        int lastindex = str.lastIndexOf("Runood");
        if(lastindex == -1){
            System.out.println("没有找到对应的字符串");
        }else{
            System.out.println("Runood最后出现的位置 " + lastindex);
        }
    }
}
