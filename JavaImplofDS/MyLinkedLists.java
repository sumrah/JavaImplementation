package com.nagarro.training.javaassignment2;

public class MyLinkedLists<E> {
	Node <E> head;
	//Node <E>iterator;
	
	void insertInList(E data)	//method to insert newnode 
	{
		Node <E> newData=new Node<>(data);
		
		//before inserting checking if list is empty or not
		if(checkEmptyList())
		{
			head=newData;
			
			return;
		}
		else {
			
		Node<E> temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newData;
		}
	}
	//inserting node at specific position
	 void insertAtPosList(int position, E data) {
	        Node <E>temp = head;
	        if (position < 1)
	            System.out.print("Invalid position");
	 
	        Node <E> newData= new Node<E>(data);
	        if(position == 0)
	        {
	        	newData.next=temp;
	        	head= newData;
	        	//iterator=head;
	        }
	        int i=1;
	        while(i!=position)
	        {
	        	temp=temp.next;
	        	i++;
	        }
	        newData.next= temp.next;
	        temp.next=newData;
	 }
 //centre of linkedlist
	 void center()
	 {
		 Node <E>slowpointer=head,fastpointer=head;
		 while(fastpointer!=null && fastpointer.next!=null)
		 {
			 slowpointer= slowpointer.next;
			 fastpointer=fastpointer.next.next;
		 }
		 System.out.println("center of linkedlist is"+slowpointer.data);
	 }
	 
	boolean checkEmptyList()
	{
		return head==null;
	}
//function to delete a node in linkedlist
	
			 void delete(E value)
			    {
			        // Stores head node
			        Node <E>temp = head;
			        Node<E>prev = null;
			 
			        // If head node holds the key to be deleted
			        if (temp != null && temp.data == value) {
			            head = temp.next;// Changed head
			            //iterator=head;
			            return;
			        }
			 
			        // Search for the key to be deleted, keep track of
			        // the previous node as we need to change temp.next
			        while (temp != null && temp.data != value) {
			            prev = temp;
			            temp = temp.next;
			        }
			 
			        // If key was not present in linked list
			        if (temp == null)
			            return;
			 
			        // Unlink the node from linked list
			        prev.next = temp.next;
			    }
		
		
	//function to delete a node in linkedlist according to position of node
	void deleteNode(int position)
	{
		Node <E> temp;
		if(checkEmptyList())
			return;
		temp= head;
		 if (position == 0) {
	            head = temp.next;  // Change head
	            //iterator=head;
	            return;
	        }
		 int i=0;
		 while(temp!=null && i< position-1)
		 {
	            temp = temp.next;
	            i++;
		 }
		 Node <E>next = temp.next.next;
	        
	     temp.next= next; // Unlink the deleted node from list
	     System.gc();
		  
	     if (temp == null || temp.next == null) // If position is more than number of nodes
	            return;
	}
	
	//reverse a linkedlist
		void reverseLinkedList()		
		{
			Node <E> temp =head;              
			Node<E> current= null;
			Node <E> previous = null;
			while(temp!=null)
			{
				previous=current;
				current=temp;
				temp=temp.next;
				current.next=previous;
			}
			head=current;
			//iterator=head;
		}
	
	//implementing iterator
	/*	public boolean hasNext() {
			return iterator!=null;
		}
		public Node <E>next() {
			@SuppressWarnings("unused")
			Node <E>temp = iterator;
			iterator=iterator.next;
			return temp;
		}*/
	
	//function to print a linkedlist
		void printLinkedLists() {
			Node <E> temp =head;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
			
		}
	//size of linkedlist
		public int sizeOfLinkedList()
	    {
	        Node<E> temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	
	public static class Node<E>{
		E data;
		Node <E> next;
		
	    Node(E data)	//constructor
			{
				this.data= data;
				next = null;
			}
	}
}
