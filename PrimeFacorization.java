package com.functionalprograms;

import com.utility.Utility;

public class PrimeFacorization {
	public static void main(String[] args) {
		//Taking user from input
		System.out.println("Enter a number... ! ");
		int num=Utility.getInt();
		//calling method
		Utility.primeFactorization(num);
	}
}
