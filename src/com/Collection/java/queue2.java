package com.Collection.java;
import java.util.PriorityQueue;
//iterate the elements of priority queue
public class queue2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
