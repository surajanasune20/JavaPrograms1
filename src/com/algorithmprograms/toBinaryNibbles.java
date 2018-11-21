package com.algorithmprograms;

import com.utility.Utility;

public class toBinaryNibbles {
	public static void main(String[] args) {
		System.out.println("Enter decial number ");
		int num = Utility.getInt();
		int Number=Utility.convertBinaryNibbles(num);
		System.out.println("Resule= " +Number);
	}
}
