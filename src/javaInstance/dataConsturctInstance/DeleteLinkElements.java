package javaInstance.dataConsturctInstance;

import java.util.LinkedList;

public class DeleteLinkElements {
    // 删除链表元素
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("100");
        l.add("200");
        l.add("300");
        l.add("400");
        l.add("500");
        System.out.println(l);
        // 删除指定区间的元素
        l.subList(2, 4).clear();
        System.out.println(l);
    }
}
