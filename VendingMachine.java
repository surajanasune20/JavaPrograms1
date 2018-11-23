package com.algorithmprograms;

import com.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		int Price = Utility.getInt();
		//call method from utility class
		Utility.vendingMachineCounter(Price);
		
	}
}
