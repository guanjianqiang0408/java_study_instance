package JavaInstance.methodInstance;

public class InstanceLableUsed {
    // 标签使用, continue label 相当于触发时返回标签处，再进入循环； break label 相当于触发时返回标签处， 不再进入循环
    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testlbl:
        for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    continue testlbl;
                }
            }
            found = true;
            break testlbl;
        }
        if (found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}
