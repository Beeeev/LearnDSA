/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackproject;

import java.util.Stack;

/**
 *
 * @author Levi
 */
public class StackProject {

    public static void main(String[] args) {
        // stack = LIFO data structure. Last in first out
        // stores objects into a sort of 'vertical tower'
        // push() to add to the top
        // pop() to remove from the top
        
        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Call of Duty");
        stack.push("Fallout");
        stack.push("Rainbow Six Siege");
        stack.push("Borderlands");
        
        //System.out.println(stack.empty());
        
        //stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("Fallout"));
        System.out.println(stack);
        
        // use of stacks
        //1. undo/redo features in text editors
        //2. moving back/forward in a browser
        //3. back tracing alogrithms (maze, file directories)
        //4. calling functions (call stack)
    }
}
