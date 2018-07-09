/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.ui;

import java.util.Random;
import java.util.Scanner;

import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.service.CollectionHelper;
import com.dthoperator.service.DataValidator;

public class Client {

	static Scanner sc = new Scanner(System.in);
	static CollectionHelper helper = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		helper = new CollectionHelper();
		while(true)
		{
			//Providing user interface
			System.out.println("\n\nDTH Recharge\n****************\n1. Make a Recharge\n2. Display Recharge Details\n3. Exit");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				makeRecharge();  break;
			case 2:
				displayDetails();  break;
			case 3:
				System.out.println("Thank You for using..!");
				System.exit(0);
				break;
			default:
				System.out.println("Choice a right option");
			}
		}
}
	
	//method for displaying details
	private static void displayDetails() {
		// TODO Auto-generated method stub
		helper.displayRechargeDetails();
		
		
	}
	
	//method for entering the details
	private static void makeRecharge() {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Select DTH Operator (Airtel / DishTV / Reliance / TATASky) : ");
			String operator = sc.next();
			
			//validating operator
			if(DataValidator.validateOperator(operator)){
				System.out.println("Enter Registered Consumer No.: ");
				String consumerNo = sc.next();
				
				//validating consumerNo
				if(DataValidator.validateConsumerNo(consumerNo)){
					System.out.println("Select Plan (Monthly / Quaterly / Yearly) : ");
					String plan = sc.next();
					
					//validating plan
					if(DataValidator.validatePlan(plan)){
						System.out.println("Enter Amount (Rs.): ");
						int amount = sc.nextInt();
						
						//generating random number for transactionId
						Random ran = new Random();
						int tid = ran.nextInt(10000);
						System.out.println("Successful Recharge. Transaction ID : "+tid);
						
						//passing details to constructor
						RechargeDetails rd = new RechargeDetails(operator,consumerNo,plan,amount,tid);
						
						helper.addRecharge(rd);
						helper.displayRechargeDetails();
					}			
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}