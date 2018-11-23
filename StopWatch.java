package com.functionalprograms;

import com.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		System.out.println("*** Stopwatch ***");
		System.out.println("Press 1 to start  ... ");
		System.out.println("Press 2 to stop");
		// Taking input from user from predefined set
		int n = Utility.getInt();
		// calling method of Utility class
		Utility.getElapsedTime(n);
	}
}
