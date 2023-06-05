package JavaInstance.dataConsturctInstance;

import java.util.LinkedList;

public class LinkModified {
    // 链表修改
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("B");
        l.add("B");
        l.add("T");
        l.add("H");
        l.add("P");
        System.out.println(l);
        l.set(2, "M");
        System.out.println(l);
    }
}
