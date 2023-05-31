package javaInstance.dataConsturctInstance;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {
    // 队列用法
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        for(String item: q){
            System.out.println(item);
        }
        // 从队列中删除第一个元素
        String pr = q.poll();
        System.out.println(pr);
        //获取第一个元素
        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q);

    }
}
