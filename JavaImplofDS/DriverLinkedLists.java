package com.nagarro.training.javaassignment2;


public class DriverLinkedLists {

	public static void main(String[] args) {
		
		MyLinkedLists<Integer> llist= new MyLinkedLists<>();
		
		llist.insertInList(20);
		llist.insertInList(30);
		llist.insertInList(40);
		llist.insertAtPosList(2, 15);
		llist.printLinkedLists();
		
		/*System.out.println("implementing iterator");
		while(llist.hasNext()) {
			System.out.println(llist.next().data);
		}*/
		
		
		System.out.println("the size of linked list is"+llist.sizeOfLinkedList());
		llist.reverseLinkedList();
		llist.printLinkedLists();
		
        System.out.println("Deleting data from linkedlist");
        llist.delete(20);
       llist.printLinkedLists();
       
       
       try {
		System.out.println("Deletes node at specific position in linkedlist");
        llist.deleteNode(4);
        }
       catch(Exception e) {
    	   System.out.println("Wrong position!!enter valid position of node to delete");
       }
       
		llist.printLinkedLists();
		llist.center();

	}
}
