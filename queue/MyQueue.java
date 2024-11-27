package com.nagarro.training.queue;

public class MyQueue<E> {
		
		Node<E> head=null;
		
		
		public boolean isEmpty() {
			if(head==null) {
				return true;
			}
			return false;
		}
		
		
		public void enqueue(E data) {
			
			Node<E> newNode= new Node<>(data);
			if(isEmpty()) {
				head=newNode;
			}
			else {
				Node<E> temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			
		}
		
		
		public void dequeue() {
			if(isEmpty()) {
				System.out.println("Queue is empty nothing to remove ");
			}else {

				if(head.next==null) {
				System.out.println("removed data: " +head.data);
				} else {
					System.out.println("removed data: "+head.data);
					head=head.next;
				}
			}
			
		}
		
		
		public void peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty nothing to peek ");
			}else {
				System.out.println("Element at top "+head.data);
			}
		}
		
		
		public int size() {
			Node<E> node= head;
			int size=0;
			while(node!=null) {
				size++;
				node=node.next;
			}
			return size;
		}
		
		
		public boolean contains(E data) {
			if(isEmpty()) {
				return false;
			}
			Node<E> node= head;
			while(node!=null) {
			if(node.data==data) {
				return true;
			}
			else {
				node=node.next;
			}
			}
			return false;
		}
		
		
		/*public void iterator() {
			
		}
		*/
		
		public Node<E> reverse() {
			Node<E> previous=null;
			Node<E> current=head;
			Node<E> nextNode=null;
			
			while(current!=null) {
				nextNode=current.next;
				current.next=previous;
				previous=current;
				current=nextNode;
			}
			head=previous;
			return head;
		}
		
		
		public void print() {
			
			Node<E> node= head;
			while(node!=null) {
				System.out.print(node.data+" ");
				node=node.next;
			}
		}
		
		
		private static class Node<E>{
	        E data;
	        Node<E> next;


	        Node(E data) {
	            this.data = data;
	            next = null;

	        }
	    }
	}


