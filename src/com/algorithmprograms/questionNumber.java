package com.algorithmprograms;

import com.utility.Utility;

public class questionNumber {
	public static void main(String[] args) {
		//take arugement from command line
		int Range=Integer.parseInt(args[0]);
		//take a range
		System.out.println("Choose Number Between 0 to "+(Range-1));
		//fisplay final result
		int result=Utility.findNumber(Range);
		//print the result
		System.out.println("Your Number is "+result);
	}
}
