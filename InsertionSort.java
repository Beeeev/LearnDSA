/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsort;

/**
 *
 * @author Levi
 */
public class InsertionSort {

    public static void main(String[] args) {
      //begin at index 1 , put it in temp storage
      //look at all values to the left, if the value is larger than temp value
      //shift all values to the right, if less than we stop keep it in the same spot
      //Quadratic time O(n^2)
      //Small data set = decent
      // Big data set = bad
      
      int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		
		insertionSort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
    }
}
