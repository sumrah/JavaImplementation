package com.nagarro.training.queue;

public class DriverQueue {

	public static void main(String []args) {
		
		 MyQueue<Integer> q = new  MyQueue<>(); 
		 
		 q.enqueue(20);
		 q.enqueue(41);
		 q.enqueue(67);
		 
		 q.print();
		 
		 q.dequeue();
		 
		 q.peek();
		 
		 System.out.println("size of queue is "+q.size());
		 
		 System.out.println(q.contains(12));
		 
		q.reverse();
		q.print();//printing reversed queue
		
	}
}
