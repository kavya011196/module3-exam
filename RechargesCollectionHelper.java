/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.junit;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dthoperator.bean.RechargeDetails;
import com.dthoperator.exception.RechargeExceptions;
import com.dthoperator.service.CollectionHelper;

	@SuppressWarnings("deprecation")
	public class RechargesCollectionHelper {

		static RechargesCollectionHelper helper;
		static RechargeDetails all=null;

		//adding details to the array list
		@BeforeClass
		public   static  void beforeClass()
		{
			helper=new  RechargesCollectionHelper();
			all=new  RechargeDetails("DishTV","3033221223","Yearly", 1260, 2345);		
		}
		
		//clearing the list
		@AfterClass
		public static  void afterClass()
		{		
			helper=null;
			all=null;
		}	
		
		//checking for details in array list
		@Test 
		public void testAddNewOperator() throws RechargeExceptions
		{
			helper.addRecharge(all);
			Assert.assertNotNull(all.getTransactionID());
		}

		private void addRecharge(RechargeDetails all2) {
			// TODO Auto-generated method stub
			
		}

	}

