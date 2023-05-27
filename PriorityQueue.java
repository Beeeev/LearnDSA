/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priorityqueue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Levi
 */
public class PriorityQueue {

    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure that serves elements
        // with the highest priorities first before elements with lower priority
        
        //Queue<Double> queue = new LinkedList<Double>();
        //queue.offer(3.0);
        //queue.offer(2.5);
        //queue.offer(4.0);
        //queue.offer(1.5);
       // while(!queue.isEmpty())
        //{
           // System.out.println(queue.poll());
        //}
        
        Queue<Double> priorityQueue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
