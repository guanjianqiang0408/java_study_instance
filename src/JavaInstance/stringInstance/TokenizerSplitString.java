package JavaInstance.stringInstance;

import java.util.StringTokenizer;

public class TokenizerSplitString {
    // StringTokenizerSplit
    public static void main(String[] args) {
        String string = "This is String , split by StringTokenizer, created by runoob";
        // 默认空格分割
        StringTokenizer stk = new StringTokenizer(string);
        while(stk.hasMoreElements()){
            System.out.println(stk.nextElement());
        }
        // 指定逗号分割
        StringTokenizer anoStk = new StringTokenizer(string, ",");
        while(anoStk.hasMoreElements()){
            System.out.println(anoStk.nextElement());
        }
    }
}
