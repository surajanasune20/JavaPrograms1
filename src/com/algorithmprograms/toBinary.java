package com.algorithmprograms;

import com.utility.Utility;

public class toBinary {
	public static void main(String[] args) {
		//enter decimal value
		System.out.println("Enter the decimal number in range 0 to 255 ");
		int num = Utility.getInt();
		//call method from utility class
		String padded=Utility.convertBinary(num);
		System.out.println(padded);
		}
}

// 
