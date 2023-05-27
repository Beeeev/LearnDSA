/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selectionsort;

/**
 *
 * @author Levi
 */
public class SelectionSort {

    public static void main(String[] args) {
        //Look at each value and keep the minimum value
        //that min value will swap to the proper place and 
        //the bigger value will take the prior min values spot
        //Quadratic time O(n^2)
        //Large Data set = bad
        //Small data set = okay
        
        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		
		selectionSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}	
	}

	private static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
    }
}
