package com.Collection.java;
import java.util.PriorityQueue;
// clear all the elements
public class queue5 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}