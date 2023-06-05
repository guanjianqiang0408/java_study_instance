package JavaInstance.dataConsturctInstance;

import java.util.LinkedList;

public class LinkElementsSearch {
    // 链表元素查找
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println(l.indexOf(1));
        System.out.println(l.lastIndexOf(1));
    }
}
