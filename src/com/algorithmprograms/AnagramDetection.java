package com.algorithmprograms;

import com.utility.Utility;

public class AnagramDetection {
	public static void main(String[] args) {
		// Accept first input string
		System.out.println("Enter first String");
		String firstString = Utility.getStringLine();
		// accpt second String
		System.out.println("Enter second String");
		String secondString = Utility.getStringLine();
		// call function from utility class
		Utility.checkAnagram(firstString, secondString);

	}
}
