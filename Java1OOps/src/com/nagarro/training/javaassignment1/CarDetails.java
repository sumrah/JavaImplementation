/*
* CarDetails
*
* Version 1st
* 
* sumrahfatima
*
* 29-03-2022
*
* This class is the driver class.It guides user to give input about car details he wants insurance for.
* And output is displayed
*/

package com.nagarro.training.javaassignment1;

import java.util.*;

public class CarDetails {
	public static void main(String args[])
	{   
		String carModel;                                         	//data members declarations
		char choice;
		double costprice;
		 
		Scanner input = new Scanner(System.in);

		do {                                                   	   //From here takinginputfromcustomer
			 
			 Menu m= new Menu();							      //Object creation for Menuclass
			 m.inputCarsTypeForInsurance();						  //enters choice for type of car:Hatchback,Sedan,SUV
			 int selection= input.nextInt();	
			 
			 System.out.println("Enter the model of car");        //Enters Carmodel
			 carModel= input.nextLine();
			 	                          
			 m.inputTypeofInsurance();						     /*function call to display type of insurance,basic or premium*/													
			 int insuranceType= input.nextInt();				 //enters type of insurance he wants 
			 
			System.out.println("Enter the costprice of car");    //enter costprice of car
		    costprice= input.nextDouble();
		    
		    switch(selection)
		    {
		    case 1: Hatchback obj= new Hatchback();
		    		obj.setcostprice(costprice);
		    		obj.setInsuranceType(insuranceType);
		    		System.out.println("For car model "+carModel+"having price "+costprice
		    						+"total insurance to be paid is"+obj.getTotal()+"\n");
		    		break;
		    		
		    case 2 : Sedan obj1= new Sedan();
		    		obj1.setcostprice(costprice);
		    		obj1.setInsuranceType(insuranceType);
		    		System.out.println("For car model "+carModel+"having price "+costprice
		    				+"total insurance to be paid is"+obj1.getTotal()+"\n");
    				break;
    				
		    case 3: SUV obj2= new SUV();
		    		obj2.setcostprice(costprice);
		    		obj2.setInsuranceType(insuranceType);
		    		System.out.println("For car model "+carModel+"having price"+"\t"+costprice
		    				          +" total insurance to be paid is"+obj2.getTotal()+"\n");
    				break;
    				
    		default : System.out.println("exit");
		    		
		  }
		    System.out.println("Do you want to enter details for another car?Type y/Y for Yes or Type N/n for No"+"\n");
		    choice= input.next().charAt(0);
		    
		    }while(choice == 'Y'|| choice =='y');
	}
		}
	

