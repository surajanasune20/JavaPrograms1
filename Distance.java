package com.functionalprograms;

import com.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);  //command line argument 
		int y = Integer.parseInt(args[1]); //command line argument

		Utility.findEuclidianDistance(x, y); //call findEuclidian function 

	}

}
