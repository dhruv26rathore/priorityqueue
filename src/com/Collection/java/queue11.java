package com.Collection.java;
import java.util.Collections;
import java.util.PriorityQueue;
//convert it into max priority queue
public class queue11 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        queue.add(10);
        queue.add(22);
        queue.add(36);
        queue.add(25);
        queue.add(16);
        queue.add(70);
        queue.add(82);
        queue.add(89);
        queue.add(14);
        System.out.println(queue);
        Integer val = null;
        while ((val = queue.poll()) != null) {
            System.out.print(val + "  ");
        }
    }
}