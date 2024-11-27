package com.nagarro.training.javaassignment2.stack;

import java.util.EmptyStackException;

public class MyStack {
		
		Node head;
	    private class Node{
			int data;
			Node next;
			
		 Node(int data)	//constructor
		{
			this.data= data;
			next = null;
		}
		}

		 public MyStack() {
			 head= null;	
		 }
		 
		 
		 public boolean isEmpty() {
				if(head==null) {
					return true;
				}
				return false;
			}
 
		 void push(int data) {
			
			 Node newNode=new Node(data);
			 if(head== null)
			 {
				 head=newNode;
				
			 }
			 else {
				newNode.next=head;
				head=newNode;
			 }
			 }
			
		 
		 
		 public void peek() {
				if(isEmpty()) {
					throw new EmptyStackException();
				}else {
					System.out.println("Element at top "+ head.data);
				}
			}
 
		  public void pop() {
			 if(isEmpty()) {
				 
				throw new EmptyStackException();
				 
				 }
			 else {
				 System.out.println("Popped element is: " + head.data);
				 head=head.next;
				 } 
		 }
		 
		  
		 public boolean contains(int element)
		 {	
			 Node top= head;
			 if(isEmpty())
			 {
				 throw  new EmptyStackException();
			 }
			 else {
			 while(top!=null)
			 {
				 if(element== top.data)
					 {
					 return true;
					 }
				 else 
				 {		top=top.next;
				 		
			 }
			 }
			 return false;
			 }
		 }
 
		 public void reverse() {
			 Node top =head;
			 Node q= null;
			 Node r = null;
				while(top!=null)
				{
					r=q;
					q=top;
					top=top.next;
					q.next=r;
				}
				head=q;
			 
		 }
 
			public int size()
			 { 
				 int count=0;
				 Node top=head;
				 while(top!=null)
				 {
					 count++;
					 top=top.next;
				 }
				 return count;
			 }
			 
 
		 public void display()
		 {
			 if(isEmpty()) {
				 System.out.println("Stack underflow");		 
			 }
			 else {
				 Node top=head;
				 while(top!=null)
				 {
					 System.out.println(top.data);
					 top=top.next;
				 }
			 }
		 }
}
