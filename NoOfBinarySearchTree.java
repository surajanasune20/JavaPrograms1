package com.datastructureprograms;

import com.utility.Utility;

public class NoOfBinarySearchTree {
	public static void main(String[] args) {
		System.out.println("Enter the value of n..");
		int n=Utility.getInt();
		
		int upper=(2*n);
		int factorial=Utility.getFactorial(upper);
		
		int down=n+1;
		int factorial1=Utility.getFactorial(down);
		
		int downRight=n;
		int factorial2=Utility.getFactorial(downRight);
		
		int downMultiplication=factorial1*factorial2;
		
		long result=factorial/downMultiplication;
		System.out.println(result);
		
	}
}
