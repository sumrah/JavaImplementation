package com.nagarro.training.nchildtree;
import java.util.ArrayList;

public class DriverNchildTree {

			public static void main(String[] args) {
			int[] array= {10, 20, 50 , -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
			ArrayList<Integer> children=new ArrayList<>();
			
			MyNchildTree tree= new MyNchildTree();

			for(int element:array) {
				children.add(element);
		      }
			
			tree.insert(children);
			
		System.out.println("do tree has 8787 "+tree.contains(8787));
			
		//level order	
		
		System.out.println("displays tree in breadth first search order");
		tree.printBFS();
		System.out.println();

		System.out.println("Displays tree in depth first search");
		tree.printDFS();
			
		tree.delete(80);	//removes the element
		System.out.println();
		tree.printBFS();
			
		tree.getElementsByLevel(3);
		System.out.println();
		tree.printBFS();
		     
		}

	}


