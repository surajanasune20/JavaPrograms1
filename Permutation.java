package com.functionalprograms;

import com.utility.Utility;

public class Permutation {
	public static void main(String[] args) {
		String str="ABCD";
		int n=str.length();
		Utility.permuteString(str,0,n-1);
	}
}
