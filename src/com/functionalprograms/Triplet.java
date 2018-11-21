package com.functionalprograms;

import com.utility.Utility;

public class Triplet {
	public static void main(String[] args) {
		System.out.println("Enter the user range...! ");
		// To count total Triplet generated
		int range=Utility.getInt();
		// calling method of Utility class
		Utility.printNoOfTriplet(range);
	}
}
