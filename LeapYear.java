package com.functionalprograms;

import com.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the leap year you want to check .. ! ");
		int Year = Utility.getInt();
		Utility.checkLeapYear(Year);
	}
}
