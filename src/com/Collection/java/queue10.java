package com.Collection.java;
import java.util.PriorityQueue;
//convert the priority queue into String
public class queue10 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        String a;
        a = queue.toString();
        System.out.println(a);
    }
}
