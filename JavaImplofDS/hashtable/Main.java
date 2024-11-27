package com.nagarro.training.javaassignment2.hashtable;

public class Main {
	
public static void main(String[]args)throws Exception{
	 Map< String, Integer> m = new Map< >();
	 m.insert("raj", 4591);
	    m.insert("suman", 2331);
	    m.insert("rohan", 5753);
	    m.printTable();
	    System.out.println("size of hashtable is"+m.size());
	    
	    //insert same key with different value,here updation will take place
	    m.insert("suman",8182);
	    
	    //Printing the get(key) when key exists
	    System.out.println("Value for suman " + m.getValueByKey("suman"));

	    //Printing the getValueByKey(key) when k key doesn't exist
	    System.out.println("Value for shweta " + m.getValueByKey("shweta"));
	    
	    //checking for containskey method 
	    System.out.println(" rohan exists in table " + m.containsKeyFunction("rohan"));
	    System.out.println("shweta exists in table " + m.containsKeyFunction("shweta"));
	    
	    //removing node and printing again
	    m.removeNode("raj");
	    m.printTable();
}
}
