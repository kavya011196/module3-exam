/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.bean;

public class RechargeDetails {

	String dthOperator;
	String consumerNo;
	String rechargePlan;
	int amount;
	int transactionID;
	
	
	public RechargeDetails(String dthOperator, String no, String rechargePlan, int amount, int transactionID) {
		this.dthOperator = dthOperator;
		this.consumerNo = no;
		this.rechargePlan = rechargePlan;
		this.amount = amount;
		this.transactionID = transactionID;
	}

	//getter for operator
	public String getDthOperator() {
		return dthOperator;
	}

	//setter for operator
	public void setDthOperator(String dthOperator) {
		this.dthOperator = dthOperator;
	}

	//getter for consumerno
	public String getConsumerNo() {
		return consumerNo;
	}

	//setter for consumerno
	public void setConsumerNo(String consumerNo) {
		this.consumerNo = consumerNo;
	}

	//getter for plan
	public String getRechargePlan() {
		return rechargePlan;
	}

	//setter for plan
	public void setRechargePlan(String rechargePlan) {
		this.rechargePlan = rechargePlan;
	}

	//getter for bill
	public int getAmount() {
		return amount;
	}

	//setter for bill
	public void setAmount(int amount) {
		this.amount = amount;
	}

	//getter for TransId
	public int getTransactionID() {
		return transactionID;
	}

	//setter for TransId
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}


	@Override
	public String toString() {
		return "RechargeDetails [dthOperator=" + dthOperator + ", consumerNo=" + consumerNo + ", rechargePlan="
				+ rechargePlan + ", amount=" + amount + ", transactionID=" + transactionID + "]";
	}
	

}
