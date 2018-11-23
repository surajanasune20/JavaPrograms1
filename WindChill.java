package com.functionalprograms;

import com.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = Utility.WindChill(t, v);
		System.out.println(w);
	}
}
