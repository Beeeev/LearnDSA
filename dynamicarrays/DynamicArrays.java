/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dynamicarrays;

import java.util.ArrayList;

/**
 *
 * @author Levi
 */
public class DynamicArrays {

    public static void main(String[] args) {
        //Dynamic Arrays in Java = ArrayList
        //C++ = Vector
        //JS = Array
        //Python = List
        
        //Dynamic  arrays when they need to expand can expand by 1.5-2x the original capacity
        
        //Advantages
        //Random access of elements O(1)
        //Data cache utilization
        //Easy to insert/delete at the end
        
        //Disadvantages
        //Wastes more memory compared to linkedlist
        //Shifting elements is time consuming O(N)
        //Expanding/Shrinking the array is time consumingO(N)
        
        DynamicArray dynamicArray = new DynamicArray(5);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		//System.out.println(dynamicArray.get(0));
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
        
    }
}
