package com.nagarro.training.priorityqueue;

public class DriverPriorityQueue {
	
	 public static void main(String[] args) {
	
	MyPriorityQueue obj= new MyPriorityQueue();
	
		obj.enqueue(30);
		obj.enqueue(20);
		obj.enqueue(15);
		System.out.println("Priority queue is");
		obj.display();
		System.out.println("\n");
	
	//peek()function
	
		if(obj.peek()==-1) {
			System.out.println("Underflow,No data found");
		}
		else {
		System.out.println("Top element is"+obj.peek());
		}
		
	//checking contains() function
		 System.out.println("do this element exists in queue "+obj.contains(14));
		
	 //removal of elements
		System.out.println("Removed element is"+obj.dequeue());
		System.out.println("Removed element is"+obj.dequeue());
		System.out.println("queue after removal of elements is");
		obj.display();
	
	//adding elements again
		obj.enqueue(80);
		obj.enqueue(200);
		obj.enqueue(100);
		System.out.println("\n"+"Now queue is ");
		obj.display();
		
	//reversal of queue
		obj.reverse();
		System.out.println("reversed list");
		obj.display();
	   
}}
