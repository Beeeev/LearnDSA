/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interpolationsearch;

/**
 *
 * @author Levi
 */
public class InterpolationSearch {

    public static void main(String[] args) {
        //can be better than binary search, used of uniformly distributed data
        //"Guesses" where a value might be based on calculated results
        // if incorrect, search area is narrowed and recalculated
        //Average case: O(log(log(N)))
        //Worst case: O(n)
        
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    	
    	int index = interpolationSearch(array, 256);
    	
    	if(index != -1) {
    		System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
    }

	private static int interpolationSearch(int[] array, int value) {
		
		int high = array.length - 1;
		int low = 0;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			
			int probe = low + (high - low) * (value - array[low]) / 
					    (array[high] - array[low]);
			
			
			System.out.println("probe: " + probe);
			
			if(array[probe] == value) {
				return probe;
			}
			else if(array[probe] < value) {
				low = probe + 1;
			}
			else {
				high = probe -1;
			}
		}
		
		return -1;
	}
}
