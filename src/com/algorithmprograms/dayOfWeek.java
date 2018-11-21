package com.algorithmprograms;

import com.utility.Utility;

public class dayOfWeek {
	public static void main(String[] args) {
		//Accept the input as command line argument
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int result = Utility.dayOfWeek(day, month, year);
		//initialize the array with elements
		String arr[] = { "sunday", "monday", "tuesday", "wednesday", "thurday", "friday", "saturday", };
		System.out.println(arr[result]);
	}
}
