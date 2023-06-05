package JavaInstance.setInstance;
import java.util.*;

public class ListElementReplace {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        Collections.replaceAll(list, "one", "hundrea");
        System.out.println("replaceAll: " + list);
    }
}
