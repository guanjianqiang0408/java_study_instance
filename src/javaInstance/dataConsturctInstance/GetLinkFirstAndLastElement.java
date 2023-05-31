package javaInstance.dataConsturctInstance;

import java.util.LinkedList;

public class GetLinkFirstAndLastElement {
    // 获取链表的第一个和最后一个元素
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("100");
        l.add("200");
        l.add("300");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
