/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Levi
 */
public class QueueProject {

    public static void main(String[] args) {
        //Queue = FIFO data Structure. First in first out (line of people)
        // A collection designed for holding elements prior to processing
        // linear data structure
        // add = enqueue, offer(), adds to the front
        // remove = dequeue, poll(), removes from the end
        
        // actually a interface not a class so the below line does not work
        //Queue<String> queue = new Queue<String>();
        
        
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        
        //1. Keyboard buffer (letters should appear on the screen in the order theyre pressed)
        //2. print queues (completed in order)
        //3. LinkedLists, PriorityQueues, Breadth First search
        
    }
}
