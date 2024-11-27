package com.nagarro.training.javaassignment2.hashtable;

import java.util.LinkedList;

	public  class Map<K,V>{
		
		private class HTNode{
			K key;
			V value;
			HTNode(K key,V value){
				this.key=key;
				this.value=value;
			}
		}
		private int size; 	//n
		private LinkedList<HTNode>[]buckets; //N= bucket.length,linkedlistarray which are null
		
		public Map() {
			initbuckets(4);
			size=0;
		}
		private void initbuckets(int N)//initalize with empty linkedlist here
		{
			buckets =new LinkedList[N];
			for(int bi=0;bi<buckets.length;bi++) {
				buckets[bi]=new LinkedList<>();
			}
		}
		public void insert(K key,V value) throws Exception{
			int bi=hashFunction(key);
			int di= getIndexWithinBucket(key,bi);
			if(di!=-1) {//means found
				HTNode node = buckets[bi].get(di);
				node.value=value;
			}
			else { //if not found then create new node in that bucket
				HTNode node = new HTNode(key,value);
				buckets[bi].add(node);
				size++;
			}
			double lambda =size *1.0/buckets.length;
			if(lambda >2.0) {
				rehash();
			}
		}
		
		
		private void rehash()throws Exception {
			LinkedList<HTNode>[]oba=buckets;
			initbuckets(oba.length*2);
			size =0;
			for(int i=0;i<oba.length;i++) {
				for(HTNode node: oba[i]) {
					insert(node.key,node.value);
				}
			}
		}
		
		
		private int hashFunction(K key) {
			int hcode= key.hashCode();
			return Math.abs(hcode)%buckets.length;
		}
		
		
		private int getIndexWithinBucket(K key,int bi) {
			int di =0;
			for(HTNode node: buckets[bi]) {//going inside bucket
				if(node.key.equals(key)) {
					return di;
				}
				di++; //if not equal
			}
			return -1; //if not found in bucket
		}
		
		
		public V getValueByKey(K key) {
			int bi=hashFunction(key);
			int di= getIndexWithinBucket(key,bi);
			if(di!=-1) {//means found
				HTNode node = buckets[bi].get(di);
				return node.value;
			}
			else { //if not found
				return null;
			}
		}
		
		
		public V removeNode(K key)throws Exception
		{
			int bi=hashFunction(key);
			int di= getIndexWithinBucket(key,bi);
			if(di!=-1) {//means found
				HTNode node = buckets[bi].remove(di);
				size--;
				return node.value;
			}
			else { //if not found
				return null;
			}
		}
		
		
		public boolean containsKeyFunction(K key) {
			int bi=hashFunction(key);
			int di= getIndexWithinBucket(key,bi);
			if(di!=-1) {//means found
				return true;
			}
			else { //if not found 
				return false;
			}
		}
		
		
		public int size() {
			return size;
		}
		
		
		public void printTable() {
			
			for(int i=0;i<buckets.length;i++) {
				System.out.println("bucket"+i+" ");
				for(HTNode node:buckets[i]) {
					System.out.print("("+node.key+","+node.value+")"+" ");
					System.out.println();
				}
			}
					}
	}
	




