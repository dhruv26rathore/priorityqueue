package com.Collection.java;
import java.util.PriorityQueue;
// Adding elements in the priority queue
public class queue1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
    }
}
