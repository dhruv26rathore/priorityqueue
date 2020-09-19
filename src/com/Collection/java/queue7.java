package com.Collection.java;
import java.util.PriorityQueue;
// Compare two priority queue
public class queue7 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Sumit");
        queue2.add("Rahul");
        queue2.add("Dhuv");
        queue2.add("Anuj");
        queue2.add("Mukl");
        System.out.println(queue2);
        for (String element:queue) {
            System.out.println(queue2.contains(element) ? "Yes":"No");
        }
    }
}
