package com.algorithmprograms;

import com.utility.Utility;

public class monthlyPayment {
	public static void main(String[] args) {
		//accept input as a command line argument
		double P=Double.parseDouble(args[0]);
		double Y=Double.parseDouble(args[1]);
		double R=Double.parseDouble(args[2]);
		Utility.monthlyPayment(P,Y,R);
	}
}
