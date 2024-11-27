package com.nagarro.training.nchildtree;
import java.util.*;

public class MyNchildTree {
		
		TreeNode root=null;
		
		public void insert( ArrayList<Integer> elements) {		//function inserts element into tree
			Stack<TreeNode> stack=new Stack<>();
			 for(int i=0;i<elements.size();i++) {
				 if(elements.get(i)==-1) {
					 stack.pop();
					 
				 } else {
					 TreeNode temp=new TreeNode(elements.get(i));
					 if(stack.size()>0) {
						 stack.peek().children.add(temp);
					 } else {
						 root=temp;
					 }
					 stack.push(temp);
					 
				}
			}
		}
		
		
		public void delete(int data) throws TreeException {			//removes the element from tree
			
			if(root==null) {
				throw new TreeException("Tree is empty");
				
			}
			
			if(contains(root,data)) {
				
				TreeNode temp= root;
				Queue<TreeNode> queue= new ArrayDeque<>();
				queue.add(temp);
				
				while(queue.size()>0) {
					if(temp.data!=data) {
						temp=queue.remove();

						for(TreeNode child: temp.children) {
							queue.add(child);
						}
					}else {
						
						temp.data=temp.children.get(0).data;
						temp.children.remove(0);
						break;
					}
				}
				
			}else {
				throw new TreeException("Element not found");
				
			}
		}
		
		
		public int height(TreeNode root) {		//internal function to calculate height of tree
			
			TreeNode temp= root;
			int height=0;
			for(TreeNode child:temp.children) {
				int childHeight = height(child);
				
				height=Math.max(childHeight, height);
				
			}
			height+=1;
			return height;
			
		}
		
		
		public void getElementsByLevel(int level) {			//displays the element according to level given
			int treeHeight= height(root);
			if(level>treeHeight) {
				System.out.println("please enter level upto "+ treeHeight);
				 return;
			}
			
			TreeNode temp= root;
			
			Queue<TreeNode> mainQueue= new ArrayDeque<>();
			Queue<TreeNode> childQueue= new ArrayDeque<>();
			
			mainQueue.add(temp);
			
			while(level>=2 && mainQueue.size()>0) {
				TreeNode node= mainQueue.remove();
				
//				System.out.print(node.data+" ");
				
				for(TreeNode child:node.children) {
					childQueue.add(child);
					
				}
				if(mainQueue.size()==0) {
					mainQueue=childQueue;
					childQueue=new ArrayDeque<>();
					System.out.println();
					level--;
				}
				
			}
			while(!mainQueue.isEmpty())
				System.out.print(mainQueue.remove().data+" ");
			
		}
		
		
		public boolean contains(TreeNode root,int data) {		//checks if data is present in tree or not
			TreeNode temp= root;
			if(temp.data==data) {
				return true;
			}
			
			for(TreeNode child:temp.children) {
				boolean containsChild= contains(child, data);
				if(containsChild) {
					return true;
				}
			}
			return false;
			
		}
		
		public boolean contains(int data) {
			return contains(root,data);
		}
		
		
		public void breadthFirstSearch(TreeNode root) {		//BFS
			if(root==null) return;
			TreeNode temp= root;
			Queue<TreeNode> queue= new ArrayDeque<>();
			queue.add(temp);
			
			while(queue.size()>0) {
				
				temp=queue.remove();
				System.out.print(temp.data+" ");
				
				for(TreeNode child: temp.children) {
					
					queue.add(child);
				}
			}
			
			
		}
		
		public void printDFS() {
			
			depthFirstSearch(root);
			
			
		}
		
		public void depthFirstSearch(TreeNode root) {		//finds element depth-wise
			if(root==null) {
				return;
			}
			TreeNode temp= root;
			System.out.print(temp.data+" ");
			
			for(TreeNode child:temp.children) {
				depthFirstSearch(child);
			}
			
		}
		
		
		public void printBFS() {
			
			breadthFirstSearch(root);
			
			
		}
		

		
		private class TreeNode{
			
			int data;
			ArrayList<TreeNode> children=new ArrayList<>();
			
			public TreeNode(int data){
				this.data=data;
			}
		}

	}


