package com.functionalprograms;

import com.utility.Utility;


public class FlipCoin {

	public static void main(String[] args) {
		System.out.println	("Enter the number of time coin flipped !");
		//get an input integer using getInt function from utility class
		int n = Utility.getInt();
		//call method from utility class
		Utility.getFlipCoinPercentage(n);        
		
	}

}
