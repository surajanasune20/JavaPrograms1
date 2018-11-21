package com.algorithmprograms;

import com.utility.Utility;

public class checkPrimeInRange {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit");
		int limit=Utility.getInt();
		System.out.println("Prime numbers from 0 to " + limit);
		System.out.println();
		Utility.checkPrime(limit);
	}

}
