package com.functionalprograms;

import com.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		//Taking value from user
		System.out.println("Enter the harmonic value n ... ");
		float num=Utility.getfloat();
		//calling method from utility class
		float sum=Utility.checkHarmonicNumber(num);
		System.out.println(sum);
	}

}
