/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.service;



	import java.util.ArrayList;
	import java.util.Iterator;
	import com.dthoperator.bean.*;
	
	public class CollectionHelper {


	private  static ArrayList<RechargeDetails> rechargeList=null;
	static
	{
		rechargeList=new ArrayList<RechargeDetails>();
		RechargeDetails Details1=new RechargeDetails("Airtel","1089343431","Monthly",210,4567);
		RechargeDetails Details2=new RechargeDetails("DishTv","1033221223","Yearly",1260,2345);
		RechargeDetails Details3=new RechargeDetails("Reliance","1923434300","Quaterly",650,1234);

		rechargeList.add(Details1);
	    rechargeList.add(Details2);
	    rechargeList.add(Details3);
	}

	public CollectionHelper(){}

	
	//adding Recharge details to the array list
	public void addRecharge(RechargeDetails rechargeDetails) 
	{			
			rechargeList.add(rechargeDetails);				
	}

	public static ArrayList<RechargeDetails> geBookList() {
		return rechargeList;
	}

	public static void setRechargeList(ArrayList<RechargeDetails> rechargeList) {
		CollectionHelper.rechargeList = rechargeList;
	}

	//display all details
	public void displayRechargeDetails()
	{
		Iterator<RechargeDetails> rechargeIt=rechargeList.iterator();
		RechargeDetails tempRecharge=null;
		while(rechargeIt.hasNext())
		{
			tempRecharge=rechargeIt.next();
			System.out.println(tempRecharge);			
		}
	}



}
