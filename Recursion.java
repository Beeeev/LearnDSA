/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author Levi
 */
public class Recursion {

    public static void main(String[] args) {
        //Apply a result of something to something
        //recursive method calls itself
        //divide a problem into subproblems
        //Commonly used with advanced sorting alogrithms and navigating trees
        
        //Adavantages
        //easier to read/write
        //easier to debug
        
        //disadvantages
        //sometimes slower
        //uses more memory
        
        //done in a LIFO method
        
        walk(5);
		System.out.println(factorial(7));
		System.out.println(power(2, 8));
	}

	private static void walk(int steps) {
		
		if(steps < 1) return; //base case
		System.out.println("You take a step!");
		walk(steps - 1); //recursive case
	}
	private static int factorial(int num) {
		
	    if (num < 1) return 1; //base case
	    return num * factorial(num - 1); //recursive case
	}

	private static int power(int base, int power) {
		
	    if (power < 1) return 1; //base case
	    return base * power(base, power - 1); //recursive case
	}
}
