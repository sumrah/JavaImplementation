package com.nagarro.training.javaassignment1;

public class Hatchback implements CarInsurance{				//implements interface CarInsurance
	private double cp;
	private int insurance_type;
	
	
	public void setcostprice(double cp)						//sets costprice of car
	{
		this.cp=cp;
	}
	public void setInsuranceType(int insurance_type)		/*sets insurancetype as basic or premium based 
															on customerchoice*/
	{
		this.insurance_type= insurance_type;
	}
    public double getTotal()								//this function calculates and returns total insurance
    {
    	switch(insurance_type)
        {
        case 1:return basic() ;
               
        case 2:return premium();
        default: return 0;
        }
    }
    
    							
    public double basic()									//calculate basic insurance
    {
    	 
        return (5*cp)/100;
    	
    }
    public double premium()									//calculate premium insurance
    {
    	return (basic()*20)/100;
    	
    }
    	
}
