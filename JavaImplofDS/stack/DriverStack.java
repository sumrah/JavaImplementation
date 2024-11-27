package com.nagarro.training.javaassignment2.stack;

import java.util.EmptyStackException;

public class DriverStack {

	public static void main(String[] args)throws Exception {

		MyStack stackobj = new MyStack();
		 
        stackobj.push(1);
        stackobj.push(2);
        stackobj.push(3);
        stackobj.display();
        
        System.out.println("printing reversed stack");
        stackobj.reverse();
        stackobj.display();
        
        System.out.println("size of stack is"+stackobj.size());
        stackobj.peek();
        
       try {
        stackobj.pop();
       }
       catch (EmptyStackException e)   
       {  
       System.out.println("empty stack");  
       }  
        //checking contains() function
        System.out.println(" Does stack contains element "+stackobj.contains(2));
        
}
}
