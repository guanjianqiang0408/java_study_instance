package JavaInstance.stringInstance;

// 删除字符串中的一个字符
public class DelStringOneChar {

    public static void main(String[] args) {
        String str = "this is Java";
        String result = removeCharAt(str, 3);
        System.out.println(result);
    }
    public static String removeCharAt(String s, int position){
        // 截取索引3前和索引3后的内容，进行拼接，就相当于删除了索引的3的内容
        return s.substring(0, position) + s.substring(position + 1);
    }
}
