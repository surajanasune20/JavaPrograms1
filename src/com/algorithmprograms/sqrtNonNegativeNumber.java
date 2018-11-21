package com.algorithmprograms;

import com.utility.Utility;

public class sqrtNonNegativeNumber {
	public static void main(String[] args) {
		//accept input from user
		System.out.println("Enter a number ");
		double num=Utility.getDouble();
		//call utility class methods
		Utility.sqrtNonNegativeNumber(num);
	}
}
