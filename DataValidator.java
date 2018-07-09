/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.service;

import java.util.regex.Pattern;

public class DataValidator {
	
	//Validating operator
	public static boolean validateOperator(String operator){
		if(operator.equalsIgnoreCase("AIRTEL")||operator.equalsIgnoreCase("DISHTV")||operator.equalsIgnoreCase("RELIANCE"))
		{
			return true;
		}
		else
		{
			System.out.println("Select from Airtel / DishTV / Reliance");
			return false;
		}	
	}
	
	//validating consumerNo
	public static boolean validateConsumerNo(String no)
	{
		//String pattern = "[0-9]+{10}";
		if(no.length()==10)
		{
			return true;
		}
		else
		{
			System.out.println("Enter a valid 10 digit registered number");
			return false;
		}
	}
	
	//validating consumer plan
	public static boolean validatePlan(String plan)
	{
		if(plan.equalsIgnoreCase("MONTHLY")||plan.equalsIgnoreCase("YEARLY")||plan.equalsIgnoreCase("QUARTERLY"))
		{
			return true;
		}
		else
		{
			System.out.println("Choose a proper plan");
			return false;
		}
	}
	
	//Validating bill amount
	public static boolean validateAmount(String amount){
		String payment = "[0-9]*";
		if(Pattern.matches(payment, amount))
		{
			return true;
		}
		else
		{
			System.out.println("Enter proper amount");
			return false;
		}
		
}
	

}
