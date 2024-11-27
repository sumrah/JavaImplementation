package com.nagarro.training.priorityqueue;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPriorityQueue {
	ArrayList<Integer>data;
	
	public MyPriorityQueue() {
		data= new ArrayList<>();
	}
	
	public void enqueue(int val) {
		data.add(val);
		upheapify(data.size()-1);
	}
	
	public void upheapify(int i) {
		if(i==0) { //base case that is if we have reached at root position
			return;
		}
		int parentIndex =(i-1)/2;
		if(data.get(i)<data.get(parentIndex)) {
			swap(i,parentIndex);
			upheapify(parentIndex);
		}		
	}
	
	private void swap(int i,int j) {
		int ithElement=data.get(i);
		int jthElement=data.get(j);
		data.set(i, jthElement);
		data.set(j, ithElement);
	
	}
	
	public int dequeue() {
		if(this.size()==0) {
			System.out.println("Queue is in Underflow");
			return -1;
		}
		swap(0,data.size()-1);
		int val=data.remove(data.size()-1); //returns element present in last
		downheapify(0);
		return val;
	}
	
	private void downheapify(int parentIndex) {
		int minIndex= parentIndex;
		
		int leftIndex=2*parentIndex+1;
		if(leftIndex<data.size()&& data.get(leftIndex)<data.get(minIndex)) {
			minIndex =leftIndex;
		}
		int rightIndex=2*parentIndex+2;
		if(rightIndex<data.size()&& data.get(rightIndex)<data.get(minIndex)) {
			minIndex =rightIndex;
		}
		if(minIndex!=parentIndex) {
			swap(parentIndex,minIndex);
			downheapify(minIndex);
		}
	}
	
	public int peek() {
		if(this.size()==0) {
			return -1;
		}
		return data.get(0);
	}
	
	public int size() {
		return data.size();
	}
	
	public void display() {
		 for (int i = 0; i < data.size(); i++)
	            System.out.print(data.get(i) + " ");
	}
	
	public void reverse() {
		int i= 0;
		int j= data.size()-1;
		while(i<=j) {
			swap(i,j);
			i++;
			j--;
		}
	}
	
	public boolean contains(int value)
	{
		int i=0;
		while(i<data.size()-1) {
			if(data.get(i)== value)
				return true;
			i++;
		}
		return false;
		
	}

	}
	

	
	
	
	
	
	




