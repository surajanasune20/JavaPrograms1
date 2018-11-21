package com.functionalprograms;

import com.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// ax^2+bX+c=0(quadratic Equation)
		System.out.println("Enter the values for quadratic equations ..");
		// Taking input from user of Coefficient a
		System.out.println("Enter the first value :  ");
		int a=Utility.getInt();
		// Taking input from user of Coefficient b
		System.out.println("Enter the Second value :  ");
		int b=Utility.getInt();
		// Taking input from user of Coefficient c
		System.out.println("Enter the Third value :  ");
		int c=Utility.getInt();
		Utility.quadraticEquation(a,b,c);
	}

}
