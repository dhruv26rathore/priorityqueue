package com.Collection.java;
import java.util.PriorityQueue;
//adding all the elements of priority queue to another priority queue
public class queue3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Amit");
        queue2.add("Hunny");
        queue2.add("Ram");
        queue2.add("Owesh");
        queue2.add("Haider");
        queue.addAll(queue2);
        System.out.println(queue2);
        System.out.println(queue);
    }
}