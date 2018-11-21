package com.functionalprograms;

import com.utility.Utility;

public class GamblerGame {
public static void main(String[] args) {
	
	System.out.println("Enter your Stake");
	// Taking value of stake from user
	int stake = Utility.getInt();
	System.out.println("Enter your Goal");

	// Taking value of goal from user
	int goal = Utility.getInt();
	System.out.println("Enter no of Times you want to play");

	// Taking value for no. of turns from the user
	float noOfTimes = Utility.getInt();

	// calling method of Utility class
	Utility.gamblingResult(stake,goal,noOfTimes);
}
}
