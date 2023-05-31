package javaInstance.dataConsturctInstance;

import java.util.LinkedList;

public class AddElmentAtLinkFirstAndLast {
    // 在链表的开头和结尾添加元素
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.addFirst("0");
        l.addLast("4");
        System.out.println(l);
    }
}
