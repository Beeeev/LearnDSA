/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

/**
 *
 * @author Levi
 */
public class BubbleSort {

    public static void main(String[] args) {
        //sorts unsorted data
        //checks 2 data points, if one is greater than the other
        //the smaller data point will swap places with the larger one ex 9,1 > 1,9
        //checks next 2 sets 1,9,8 > 1,8,9 and so on
        //it will lap the data set and continue till its sorted
        //not very effecient O(n^2)
        
        	int array[] =  {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		bubbleSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
	}
	
	public static void bubbleSort(int array[]) {
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
    }
}
