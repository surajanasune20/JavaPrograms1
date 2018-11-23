package com.algorithmprograms;

import com.utility.Utility;

public class SearchSortMethods {
	public static void main(String[] args) {

		//All searching and sorting methods print
		System.out.println(" SEARCHING AND SORTING METHODS ! ");
		System.out.println("\n1. BinarySearch method for integer ");
		System.out.println("\n2. BinarySearch method for String ");
		System.out.println("\n3. InsertionSort method for integer ");
		System.out.println("\n4. InsertionSort method for String ");
		System.out.println("\n5. BubbleSort method for integer ");
		System.out.println("\n6. BubbleSort method for String ");
		System.out.println(" \n Enter your choice : ");
		int choice = Utility.getInt();
		//get the choice from user
		switch (choice) {
		
		case 1: 
			System.out.println(" >> BinarySearch method for integer ");
			long starttime=System.currentTimeMillis();
			Utility.binarySearchForInteger();
			long endtime=System.currentTimeMillis();
			long elepsedtime=(starttime-endtime)/1000;
			System.out.println("Elapsed time is " +elepsedtime);
		case 2:
			long starttime5=System.currentTimeMillis();
			System.out.println(" >> BinarySearch method for String ");
			Utility.binarySearchForString();
			long endtime5=System.currentTimeMillis();
			long elepsedtime5=(starttime5-endtime5)/1000;
			System.out.println("Elapsed time is " +elepsedtime5);
		case 3:
			long starttime1=System.currentTimeMillis();
			System.out.println(" >> InsertionSort method for integer ");
			Utility.getInsertionSortInteger();
			long endtime1=System.currentTimeMillis();
			long elepsedtime1=(starttime1-endtime1)/1000;
			System.out.println("Elapsed time is " +elepsedtime1);
		case 4:
			long starttime2=System.currentTimeMillis();
			System.out.println(" >> InsertionSort method for String ");
			Utility.getInsertionSortString();
			long endtime2=System.currentTimeMillis();
			long elepsedtime2=(starttime2-endtime2)/1000;
			System.out.println("Elapsed time is " +elepsedtime2);
		case 5:
			long starttime3=System.currentTimeMillis();
			System.out.println(" >> BubbleSort method for integer ");
			Utility.getBubbleSortInteger();
			long endtime3=System.currentTimeMillis();
			long elepsedtime3=(starttime3-endtime3)/1000;
			System.out.println("Elapsed time is " +elepsedtime3);
		case 6:
			long starttime4=System.currentTimeMillis();
			System.out.println(" >> BubbleSort method for String ");
			Utility.getBubbleSortString();
			long endtime4=System.currentTimeMillis();
			long elepsedtime4=(starttime4-endtime4)/1000;
			System.out.println("Elapsed time is " +elepsedtime4);
		}
	}
}
