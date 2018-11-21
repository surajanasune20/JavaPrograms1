package com.algorithmprograms;

import com.utility.Utility;

public class temperaturConversion {
	public static void main(String[] args) {
		int n1;
		do {
			//accpet the tempreture value from user 
			System.out.println("Enter the tempreture...  >> \n ");
			double tempreture = Utility.getDouble();
			//enter choice
			System.out.println("\n1.In Fahrenheit \n2. In Celsius");
			n1 = Utility.getInt();
			switch (n1) {
			case 1:
				double Ftemp = Utility.getFaranite(tempreture);
			case 2:
				double Ctemp = Utility.getCelcius(tempreture);
			System.out.println(Ctemp);
			}

		} while (n1 > 0);

	}
}
