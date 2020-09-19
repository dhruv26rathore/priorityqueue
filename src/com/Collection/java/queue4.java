package com.Collection.java;
import java.util.PriorityQueue;
//add the given element into the priority queue
public class queue4 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        queue.offer("Abhi");
        System.out.println(queue);
    }
}
