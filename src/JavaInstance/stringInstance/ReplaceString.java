package JavaInstance.stringInstance;

public class ReplaceString {
    // 替换字符串
    public static void main(String[] args) {
        String str = "Hello World";
        // 替换H为W
        System.out.println(str.replace("H", "W"));
        // 替换第一个匹配到的He字符串
        System.out.println(str.replaceFirst("He", "We"));
        // 替换全部匹配到的字符串
        System.out.println(str.replaceAll("He", "Ha"));
    }
}
