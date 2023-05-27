/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashtables;

import java.util.Hashtable;

/**
 *
 * @author Levi
 */
public class HashTables {

    public static void main(String[] args) {
        //Think of key value pairs
        //divide each hashcode by the capacity of the table
        //which the result becomes our index 
        //for instance 100 % 10 = 0, 0 is our index
        //if collsion occurs, say 2 values have a 0 for index
        //a linkedlist is created and the address for the next entry is created
        //if more collision occurs then more addresses are made
        //FAST insertion, look up, deletion of key/value pairs
    	//Not ideal for small data sets, great with large data sets
        
        Hashtable<Integer, String> table = new Hashtable<>(10);
    	
    	table.put(100, "Spongebob");
    	table.put(123, "Patrick");
    	table.put(321, "Sandy");
    	table.put(555, "Squidward");
    	table.put(777, "Gary");
    	  	
    	for(Integer key : table.keySet()) {
    		System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    }
    }
}
