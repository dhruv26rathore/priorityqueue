package com.Collection.java;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
//convert queue into the array list
public class queue9 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sumit");
        queue.add("Rahul");
        queue.add("Dhruv");
        queue.add("Anuj");
        queue.add("Mukul");
        System.out.println(queue);
        List<String> array_list = new ArrayList<String>(queue);
        System.out.println(array_list);
    }
}
