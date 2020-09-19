package com.Collection.java;
import java.util.PriorityQueue;
// get the size of queue
public class queue6 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        System.out.println(queue.size());
    }
}