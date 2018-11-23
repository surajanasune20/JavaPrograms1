package com.datastructureprograms;

import com.utility.Utility;

public class BankCashCounter {
	public static void main(String[] args) {
		int balance=500;//initialize balance to 500
		
		//Accept the size of queue
		System.out.println("Enter the max size... ");
		int maxSize=Utility.getInt();
		//No of persons in the queue
		System.out.println("Enter the number of persons ");
		int persons=Utility.getInt();
		
		//pass the size and persons size using creating object
		Queue que=new Queue(maxSize,persons);
		//call utility class  method
		Utility.bankingCashCounterUti(que,balance,persons);
	}
}
