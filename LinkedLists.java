/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlists;

import java.util.LinkedList;

/**
 *
 * @author Levi
 */
public class LinkedLists {

    public static void main(String[] args) {
       // Array lists are contingous, not great for inserting and deleting elements in the array
       // When inserting elements, lets say in element 3, when inserting on 3, everything shifts
       // Great for small sets of data but imagine handling 1 million in this case
       
       // Linked lists have nodes, each node contains a address to another node
       // End of the Linked list is when the address is null
       // No shifting is needed due to the addresses being saved
       // Bad at searching, Have to start at the head and end at the tail
       // Singly lists have one address, doubly have two addresses.
       // Doubly allows starting from the tail or head
       // uses more memory since it has access to the next and previous node
       
       // advantages of Linked list
       // Dynamic data structure (allocates memory as needed)
       // Insertion and deletion of nodes is easy O(1)
       // No/Low memory waste
       
       // disadvantages
       // greater memory usage
       // No random access of elements (no index [i])
       // Accessing/searching elements is more time consuming O(n)
       
       // uses
       // implement stacks/queues
       // gps navigation, each stop is a node, any detours can be added easily
       // music playlist, each song might not be in the same place in your memory
       
       
       LinkedList<String> linkedList = new LinkedList<String>();
       /*
       linkedList.push("A");
       linkedList.push("B");
       linkedList.push("C");
       linkedList.push("D");
       linkedList.push("F");
       linkedList.pop();
       */
       
       //this mimics a queue
       linkedList.offer("A");
       linkedList.offer("B");
       linkedList.offer("C");
       linkedList.offer("D");
       linkedList.offer("F");
       //linkedList.poll();
       
       linkedList.add(4, "E");
       linkedList.remove("E");
       System.out.println(linkedList.indexOf("F")); 
       System.out.println(linkedList.indexOf(linkedList.peekFirst())); 
       System.out.println(linkedList.indexOf(linkedList.peekLast())); 
       linkedList.addFirst("0"); 
       linkedList.addLast("G");
       String first = linkedList.removeFirst();
       String last = linkedList.removeLast();
       
       System.out.println(linkedList);
    }
}
