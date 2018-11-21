package com.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import Utility.Utility1;

public class Utility {
	static String string;
	static int num;
	static double doublenum;
	static float floatnum;
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br;
	public Utility(){
		 br = new BufferedReader(new InputStreamReader(System.in));
}
	public static String getString() {
		string = sc.next();
		return string;

	}

	public static double getDouble() {
		doublenum = sc.nextDouble();
		return doublenum;
	}

	public static String getStringLine() {
		string = sc.nextLine();
		return string;

	}

	public static float getfloat() {
		floatnum = sc.nextFloat();
		return floatnum;
	}

	/**
	 * User Input and Replace String Template “Hello <<UserName>>, How are you?”
	 * 
	 * @param template
	 * @param name
	 * @param replacewith
	 * @return
	 */
	public static String replace(String template, String name, String replacewith) {
		// Using predefined method of string class
		String finalString = template.replace(name, replacewith);
		return finalString;
	}

	public static int getInt() {
		num = sc.nextInt();
		return num;
	}

	public static int[] getPrime() {
		int[] primeArray = new int[1000];
		int count = 0;
		boolean isPrime = true;
		for (int i = 0; i < 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeArray[count++] = i;
			}
		}
		return primeArray;

	}

	/**
	 * Flip Coin and print percentage of Heads and Tails
	 * 
	 * @param n
	 */
	public static void getFlipCoinPercentage(int n) {
		Random r = new Random();
		float heads = 0;
		// loop will iterate till user value
		for (int i = 1; i <= n; i++) {
			// it generates random value less than 2
			int value = r.nextInt(2);
			// considering 1 as head
			if (value == 1) {
				heads++;
			}
		}
		// finding head percentage
		float headpercent = heads / n * 100;

		float tailpercent = 100 - headpercent;
		System.out.println("Percentage of head : " + headpercent);
		System.out.println("Percentage of tail : " + tailpercent);

	}

	/**
	 * Leap Year
	 * 
	 * @param leapYear
	 */
	public static void checkLeapYearOrNot(int Year) {
		int count = 0, q = Year, r = 0;

		// Counting digits of year entered to ensure 4 digit
		while (q > 0) {
			r = q % 10;
			q = q / 10;
			count++;
		}

		// comparing count value with 4 to ensure count have 4 digits
		if (count == 4) {

			// Condition for Leap Year
			if (Year % 100 == 0 && Year % 400 == 0)
				System.out.println(Year + " is a Leap year");
			else
				System.out.println(Year + " in not a leap year");
		}

		else {
			System.out.println("Year must have four digit ,So Enter 4 digit");
			Year = getInt();

			// Using Recursion i.e calling same within itself
			checkLeapYearOrNot(Year);
		}

	}

	public static void powerOf2(int range) {
		int Base = 2;
		long result1 = 1;
		if (range >= 31 || range < 0) {
			System.out.println("Enter range is in between 0 to 31 ");
			int range1 = getInt();
			powerOf2(range1);
		} else {
			while (range > 0 && range < 31)

			{

				result1 = result1 * Base;
				System.out.println(result1);
				range--;

			}

		}
	}

	/**
	 * This method is used to determine whether given two Strings are anagram of
	 * each other or not
	 * 
	 * @param firstString
	 * @param secondString
	 */
	public static void checkAnagram(String firstString, String secondString) {
		String spaceFirstString = ""; // initialize empty string
		String spaceSecondString = "";//// initialize empty string

		// check if any spaces comes
		for (int i = 0; i < firstString.length(); i++) {
			char ch = firstString.charAt(i);
			if (ch == ' ')
				continue;
			spaceFirstString += ch;
		}
		firstString = "";
		// convert into lowercase
		firstString = spaceFirstString.toLowerCase();
		// check if any spaces comes in second string
		for (int j = 0; j < secondString.length(); j++) {
			char ch = secondString.charAt(j);
			if (ch == ' ')
				continue;
			spaceSecondString += ch;
		}
		// initalize empty string
		secondString = "";
		// convert into lowercase
		secondString = spaceSecondString.toLowerCase();

		// make character array for storing firstString character
		char[] storeCharFirstString = new char[firstString.length()];
		// make character array for storing secondstring character
		char[] storeCharSecondString = new char[secondString.length()];

		// take firstString character and store into array
		for (int i = 0; i < firstString.length(); i++) {

			char ch = firstString.charAt(i);
			storeCharFirstString[i] = ch;
		}
		// take secondString character and store into array
		for (int i = 0; i < secondString.length(); i++) {

			char ch = secondString.charAt(i);
			storeCharSecondString[i] = ch;
		}
		// check anagram condition
		for (int i = 0; i < storeCharFirstString.length; i++) {
			for (int j = i + 1; j < storeCharSecondString.length; j++) {
				if (storeCharFirstString[i] > storeCharFirstString[j]) {
					char ch = storeCharFirstString[i];
					storeCharFirstString[i] = storeCharFirstString[j];
					storeCharFirstString[j] = ch;
				}
			}
		}
		// initialize empty string
		firstString = "";
		for (int i = 0; i < storeCharFirstString.length; i++) {
			firstString += storeCharFirstString[i];
		}

		for (int i = 0; i < storeCharSecondString.length; i++) {
			for (int j = i + 1; j < storeCharSecondString.length; j++) {
				if (storeCharSecondString[i] > storeCharSecondString[j]) {
					char ch = storeCharSecondString[i];
					storeCharSecondString[i] = storeCharSecondString[j];
					storeCharSecondString[j] = ch;
				}
			}
		}
		// initialize empty string
		secondString = "";
		for (int i = 0; i < storeCharSecondString.length; i++) {
			secondString += storeCharSecondString[i];
		}
		// compares a string on specified object
		if (firstString.equals(secondString)) {
			System.out.println("both String are anagram to each other ");
		} else {
			System.out.println("both String are not anagram to each other ");
		}

	}

	/**
	 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
	 * 
	 * @param limit
	 */

	public static void checkPrime(int limit) {
		// initialize status true
		boolean isPrime = true;
		for (int i = 0; i < limit; i++) {
			// check if 0 or 1 then continue
			if (i == 0 || i == 1)
				continue;

			isPrime = true;

			for (int j = 2; j <= i / 2; j++) {
				// if 0 then false
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// if true then print
			if (isPrime) {
				System.out.println(i + "");
			}
		}

	}

	/**
	 * Extend the above program to find the prime numbers that are Anagram and
	 * Palindrome
	 */
	public static void checkPrimePalindrome() {
		int[] storePrimeNumbers = new int[1000];
		int[] storePalindromes = new int[1000];
		boolean isPrime = true;
		int count = 0, count1 = 0;

		for (int i = 0; i < 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				storePrimeNumbers[count++] = i;
			}

			if (isPrime) {
				num = i;
				int remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;

				}
				if (reverse == i) {
					storePalindromes[count1++] = i;
				}
			}

		}
		for (int k = 0; k < storePalindromes.length; k++) {
			if (storePalindromes[k] > 0)
				System.out.println(storePalindromes[k]);
		}

	}

	/**
	 * Extend the above program to find the prime numbers that are Anagram and
	 * Palindrome
	 * 
	 */
	public static void checkPrimeAnagram() {
		int count1 = 0;

		// initializing array using getPrime method of Utility class
		int[] primeArray = Utility.getPrime();

		// Counting non- zero elements of primeArray
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] != 0)
				count1++;
		}
		// creating array with count1 length
		int[] x = new int[count1];

		// initializing integer array with non-zero elements of primeArray
		for (int i = 0; i < x.length; i++) {
			if (primeArray[i] != 0)
				x[i] = primeArray[i];
		}

		// creating string array with integer array length
		String[] sAray = new String[x.length];
		String[] compareAray = new String[x.length];
		for (int i = 0; i < x.length; i++) {

			// converting each integer elements into string and storing to string array
			sAray[i] = Integer.toString(x[i]);
		}
		int i = 0, j = 0, count = 0;
		String s3 = "";

		// Assigning array value to string s1
		for (int m = 0; m < sAray.length; m++) {
			String s1 = sAray[m];

			// creating character array with the size of s1.length
			char[] ch2 = new char[s1.length()];

			/**
			 * Splitting each character of string s1 using chatAt() and storing into ch2
			 * array
			 */

			for (i = 0; i < s1.length(); i++) {

				char ch = s1.charAt(i);
				ch2[i] = ch;
			}

			// Sorting characters of char array using bubble sort
			for (j = 0; j < ch2.length; j++) {
				for (int k = j + 1; k < ch2.length; k++) {

					if (ch2[j] > ch2[k]) {

						char temp = ch2[j];
						ch2[j] = ch2[k];
						ch2[k] = temp;
					}

				}
			}
			s1 = "";
			// concatenating sorted characters of a char array to String s1
			for (i = 0; i < ch2.length; i++)
				s1 = s1 + ch2[i];

			compareAray[m] = s1;

		}

		System.out.println("THe Prime Numbers that are Anagram of each other are as follows");
		for (int p = 0; p < compareAray.length; p++) {

			count = 0;
			for (int q = p + 1; q < compareAray.length; q++) {

				/**
				 * Here we are comparing sorted Strings that are stored in compareAray & but we
				 * are printing the actual integer values that are present in place of those
				 * sorted strings and we have stored those actual integer values in x array
				 */
				if (compareAray[p].equals(compareAray[q]) & (compareAray[p].equals("")) == false) {

					System.out.println(x[q]);
					compareAray[q] = "";
					count++;

				}
			}
			// printing the values from which we are comparing i.e x[p]
			if (count > 0) {
				System.out.println(x[p]);
			}

		}

	}

	public static String[] sortString(String[] strarr) {
		int l = strarr.length;
		for (int i = 1; i < l; i++) {
			String key = strarr[i];// initialize the element in the key
			int j = i - 1;
			while (j >= 0 && strarr[j].compareTo(key) > 0) {
				strarr[j + 1] = strarr[j];// swap the var
				j = j - 1;
			}
			strarr[j + 1] = key;// again the swap

		}
		return strarr;
	}

	public static int[] sort(int[] filearray) {

		int temp;
		for (int i = 0; i < filearray.length; i++) {

			for (int j = i + 1; j < filearray.length; j++) {
				if (filearray[i] > filearray[j]) {
					temp = filearray[i];
					filearray[i] = filearray[j];
					filearray[j] = temp;
				}
			}
		}
		return filearray;
	}

	public static void binarySearchForInteger() {
		System.out.println("Enter how many elements you want to enter ");
		int num = Utility.getInt();
		int[] arrayInt = new int[num];
		System.out.println("Enter the elements");
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Utility.getInt();
		}
		int[] fileArray = Utility.sort(arrayInt);
		System.out.println("After Sorted Array is : ");
		for (int i = 0; i < fileArray.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(fileArray[i]);
		}
		System.out.println();
		System.out.println("Enter the element you want to search.. \n ");
		int searchElement = Utility.getInt();
		int mid = binarySearch(fileArray, searchElement);
		if (mid != -1) {
			System.out.println("Element is found at " + mid + " position");
		}

	}

	private static int binarySearch(int[] fileArray, int searchElement) {
		int first = 0;
		int last = fileArray.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (fileArray[mid] == searchElement) {
				// System.out.println("Element at "+mid);
				return mid;
			} else if (fileArray[mid] < searchElement) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		System.out.println("Unsussfull .... >> Not Found");
		return -1;
		// long endtime = System.currentTimeMillis();
		// System.out.println("Elapsed time is : " + (starttime - endtime) / 1000);
	}

	public static void binarySearchForString() {
		System.out.println("Enter how many elements you want to enter ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		Utility.sortString(strarr);
		;
		System.out.println("> > After Sorting < < ");
		for (int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		System.out.println("\n  Enter the elements you want to search... ");
		String a = Utility.getString();
		int mi = Utility.getBinarySearchString(strarr, a);
		if (mi != -1)
			System.out.println("Element is ata " + mi + " index position");

	}

	public static int getBinarySearchString(String[] strarr, String a) {
		int li = 0;
		int hi = strarr.length - 1;
		int mi = 0;

		while (li <= hi) {
			mi = (li + hi) / 2;
			if (strarr[mi].compareTo(a) == 0) {
				return mi;
			} else if (strarr[mi].compareTo(a) < 0) {
				li = mi + 1;
			}

			else {
				hi = mi - 1;
			}
		}

		System.out.println("element not found");
		return -1;

	}

	public static void getInsertionSortInteger() {
		System.out.println("Enter the number of elements : ");
		// accept elements
		int num = Utility.getInt();
		// initialize array with elements size
		int[] arr = new int[num];
		// Enter the elements and print it
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < num; i++) {
			arr[i] = Utility.getInt();

		}
		// Enter the elements before sort
		System.out.println("Before Insertion sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

		System.out.println();
		// call insertion sort method using Utility class method
		Utility.insertionSort(arr);

	}

	public static void insertionSort(int[] arr) {
		int temp, i, j;

		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;

		}
		System.out.println();

		System.out.println("After Insertionsort.....  \n ");
		for (i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

	public static void getInsertionSortString() {
		System.out.println("Enter the number of elements : ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		int a = strarr.length;
		// String sortedArray=sort_sub(strarr,strarr.length);
		String[] sortedArray = Utility.insertionSortString(strarr);
		System.out.println(" > >  After insertion sort < < ");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	private static String[] insertionSortString(String[] strarr) {
		String temp = "";
		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i].compareToIgnoreCase(strarr[j]) > 0) {
					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
		}

		return strarr;

	}

	public static void getBubbleSortInteger() {
		System.out.println("Enter the number of elements : ");
		// accept elements
		int num = Utility.getInt();
		// initialize array with elements size
		int[] arr = new int[num];
		// Enter the elements and print it
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < num; i++) {
			arr[i] = Utility.getInt();

		}
		// Enter the elements before sort
		System.out.println("Before Bubble sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

		System.out.println();
		Utility.bubbleSortForInt(arr);

	}

	public static void bubbleSortForInt(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("After Bubble Sort..");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

	public static void getBubbleSortString() {
		System.out.println("Enter the number of elements : ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		int a = strarr.length;
		// String sortedArray=sort_sub(strarr,strarr.length);
		String[] sortedArray = Utility.bubbleSortString(strarr);
		System.out.println(" After Bubble sort");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	public static String[] bubbleSortString(String[] strarr) {
		String temp;

		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i].compareTo(strarr[j]) > 0) {
					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;

				}
			}

		}
		return strarr;

	}

	/**
	 * Read in a list of words from File. Then prompt the user to enter a word to
	 * search the list. The program reports if the search word is found in the list.
	 * 
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFiles(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		Utility.sortString(filearray);

		System.out.println(Arrays.toString(filearray));
		// Accept the key you want to search
		System.out.println("Enter the word you want to search in list");
		String key = Utility.getString();
		// call method in utility class
		int mid = getBinarySearchString(filearray, key);
		if (mid != -1)
			// print the position
			System.out.println("The entered string should be present in " + mid + " position");
		return filearray;
	}

	/**
	 * Reads in strings from standard input and prints them in sorted order. Uses
	 * insertion sort.
	 * 
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFilesForInsertionSort(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		System.out.println("After sort..");
		insertionSortString(filearray);
		for (int i = 0; i < filearray.length; i++) {
			System.out.print(filearray[i] + ",");
		}
		// Accept the key you want to search

		return filearray;
	}

	/**
	 * Reads in integers prints them in sorted order using Bubble Sort
	 * 
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFilesForBubbleSort(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		System.out.println("After sort..");
		// call method from utility class
		bubbleSortString(filearray);
		for (int i = 0; i < filearray.length; i++) {
			System.out.print(filearray[i] + ",");
		}
		// Accept the key you want to search

		return filearray;
	}

	/**
	 * o the Util Class add dayOfWeek static function that takes a date as input and
	 * prints the day of the week that date falls on.
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int day, int month, int year) {
		// predefined formula
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/**
	 * To the Util Class add temperaturConversion static function, given the
	 * temperature in fahrenheit as input outputs the temperature in Celsius or
	 * viceversa using the formula
	 * 
	 * @param tempreture
	 * @return
	 */
	public static double getFaranite(double tempreture) {
		// formula to print tempreture in faranite form
		tempreture = (tempreture * 9 / 5) + 32;
		return tempreture;

	}

	/**
	 * To the Util Class add temperaturConversion static function, given the
	 * temperature in fahrenheit as input outputs the temperature in Celsius or
	 * viceversa using the formula
	 * 
	 * @param tempreture
	 * @return
	 */
	public static double getCelcius(double tempreture) {
		// formula to print tempreture in getCelcius form
		tempreture = (tempreture - 32) * 5 / 9;
		return tempreture;
	}

	/**
	 * Write a Util Static Function to calculate monthlyPayment that reads in three
	 * command-line arguments P, Y, and R and calculates the monthly payments you
	 * would have to make over Y years to pay off a P principal loan amount at R per
	 * cent interest compounded monthly.
	 * 
	 * @param P
	 * @param Y
	 * @param R
	 */
	public static void monthlyPayment(double P, double Y, double R) {
		// initialize the payemtn ad a variable
		double payment;
		double r = R / (12 * 100);
		double n = 12 * Y;

		double upper = P * r;
		double first = (1 + r);
		// predefined power function
		double second = Math.pow(first, (-1 * n));
		double third = 1 - second;
		payment = upper / third;
		// print
		System.out.println(payment);
	}

	/**
	 * Write a static function sqrt to compute the square root of a nonnegative
	 * number c given in the input using Newton's method:
	 * 
	 * @param c
	 */
	public static void sqrtNonNegativeNumber(double num) {
		double t = num;
		double epsilon = 1e-15;
		// calculate t with predefined formula upto its value is greter than t
		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		System.out.println(t);
	}

	/**
	 * Write a static function toBinary that outputs the binary (base 2)
	 * representation of the decimal number typed as the input.
	 * 
	 * @param num
	 * @return
	 */
	public static String convertBinary(int num) {

		String s = "";
		while (num >= 1) {
			s += num % 2;
			num = num / 2;
		}
		String s2 = "";
		for (int start = s.length() - 1; start >= 0; start--) {
			s2 += s.charAt(start);
		}
		return s2;
		/*
		 * String s = ""; if (num >= 0 && num <= 255) { String string1 = ""; int
		 * remainder; while (num > 0) { remainder = num % 2; string1 = string1 + "" +
		 * remainder;
		 * 
		 * num = num / 2; } char[] string3 = string1.toCharArray();
		 * 
		 * for (int i = string3.length - 1; i >= 0; i--) { s = s + string3[i]; }
		 * 
		 * } else {
		 * System.out.println("Enter the value less than 255 or gretter than 0");
		 * num=Utility.getInt(); convertBinary(num); } int result = Integer.parseInt(s);
		 * 
		 * String padded = String.format("%08d", result); return padded;
		 */
	}

	/**
	 * Write Binary.java to read an integer as an Input, convert to Binary using
	 * toBinary function and perform the following functions
	 * 
	 * @param Number
	 * @return
	 */
	public static int convertBinaryNibbles(int Number) {

		String binaryString = convertBinary(Number);
		int x = 8 - binaryString.length();
		String s = "";
		for (int i = 0; i < x; i++) {
			s += "0";
		}

		binaryString = s + binaryString;
		String firstnibble = binaryString.substring(0, 4);
		String secondnibble = binaryString.substring(4);
		binaryString = secondnibble + firstnibble;
		s += "0";
		x = 1;
		int changeNumber = 0;
		for (int start = binaryString.length() - 1; start >= 0; start--) {
			changeNumber = changeNumber + (Integer.parseInt(binaryString.charAt(start) + "")) * x;
			x = x * 2;
		}
		return changeNumber;
	}

	/**
	 * TFind the Fewest Notes to be returned for Vending Machine
	 * 
	 * @param Price
	 */
	public static void vendingMachineCounter(int Price) {
		// intialize noteType array
		int NoteType[] = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		// initalie array with noteType count size
		int NoteCount[] = new int[NoteType.length];

		for (int i = NoteType.length - 1; i >= 0; i--) {
			NoteCount[i] = Price / NoteType[i];
			Price = Price % NoteType[i];
		}

		for (int j = NoteType.length - 1; j >= 0; j--) {
			if (NoteCount[j] == 0)
				continue;
			System.out.println(NoteType[j] + " -- > " + NoteCount[j]);
		}

	}

	/**
	 * takes a command-line argument N, asks you to think of a number between 0 and
	 * N-1, where N = 2^n, and always guesses the answer with n questions.
	 * 
	 * @param range
	 * @return
	 */
	public static int findNumber(int range) {
		// initialize lower to 0
		int lower = 0;
		// calculate upper value from range value
		int upper = range - 1;
		// initialize answer with zero
		int Answer = 0;
		// check condition
		while (lower <= upper) {
			{
				// calculate the middle value from upper to lower
				int mid = (lower + upper) / 2;
				System.out.println("Is your number is in between " + lower + " " + mid);
				String s = Utility.getString();
				if ((upper == lower || lower + 1 == upper) && s.equals("true")) {
					Answer = lower;
					break;
				}
				if ((upper == lower || lower + 1 == upper) && s.equals("false")) {
					Answer = lower + 1;
					break;
				}

				if (s.equals("false")) {
					lower = mid + 1;
				} else if (s.equals("true")) {
					upper = mid - 1;
				}
			}

		}
		return Answer;
	}

	/**
	 * Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	 * 
	 * @param num
	 * @return
	 */
	public static float checkHarmonicNumber(float num) {

		if (num <= 0) {
			System.out.println("Enter the value of number greater than 0 ");
			num = getfloat();
		}
		if (num > 0) {
			return harmonicCalculation(num);

		}

		return (Float) null;

	}

	private static float harmonicCalculation(float num2) {

		float i;
		float sum = 0;
		// loop will iterate untill user value
		for (i = 1; i <= num2; i++) {
			// adding reciprocal of all user value
			sum += 1 / i;
		}

		return sum;

		// TODO Auto-generated method stub

	}

	/* ***********************Harmonic number end *************************/

	/**
	 * Computes the prime factorization of N using brute force.
	 * 
	 * @param num2
	 */
	public static void primeFactorization(int num2) {
		boolean isPrime = true;
		// int n=147;
		int N = num2;

		// Finding all primes Numbers till user value
		for (int i = 2; i <= num2; i++) {
			isPrime = true;

			// iterating loop to check each value of i is Prime or not
			for (int j = 2; j <= i / 2; j++)
				if (num2 % j == 0) {
					isPrime = false;
				}
			if (isPrime) {
				N = num2;// user value ,for which we have to find Prime factors

				/**
				 * iterating while loop until remainder is Zero if i divides user
				 * value(example-12) ,then i is our prime factor, if again divide then again i
				 * is our Prime factor.
				 * 
				 */
				while (N % i == 0) {

					// updating N value
					N = N / i;

					// Printing Prime Factors of user value
					System.out.println(i);
				}
			}
		}
	}

	/**
	 * Simulates a gambler who start with $stake and place fair $1 bets until he/she
	 * goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
	 * times he/she wins and the number of bets he/she mak
	 * 
	 * @param stake
	 * @param goal
	 * @param noOfTimes
	 */
	public static void gamblingResult(int stake, int goal, float noOfTimes) {
		int count = 0;
		int win = 0;
		int loss = 0;
		while (stake != 0 && stake != goal && count != noOfTimes) {
			if (Math.random() > .5) {
				stake--;
				loss++;
			} else {
				stake++;
				win++;
			}
			count++;
		}

		System.out.println("No Of Times Win " + win);
		System.out.println("Win Percentage " + (win * 100 / count));
		System.out.println("loss Percentage " + (loss * 100 / count));

	}

	/**
	 * A library for reading in 2D arrays of integers, doubles, or booleans from
	 * standard input and printing them out to standard output.
	 * 
	 * @param arr
	 */
	public static void print2dArray(int[][] arr) {
		// printwriter
		PrintWriter re = new PrintWriter(System.out, true);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				re.print(arr[i][j] + " ");
			}
			re.println();
		}
	}

	/**
	 * A program with cubic running time. Read in N integers and counts the number
	 * of triples that sum to exactly 0.
	 * 
	 * @param range
	 */
	public static void printNoOfTriplet(int range) {
		int totalCount = 0;
		int[] userNumber = new int[range];
		System.out.println("Enter value.. ");
		// initializing array with user value

		for (int i = 0; i < range; i++)
			userNumber[i] = getInt();

		for (int i = 0; i < userNumber.length; i++) {
			for (int j = i + 1; j < userNumber.length; j++) {

				for (int k = j + 1; k < userNumber.length; k++) {
					// adding value in array at i and j index
					// storing array value of j index in jthValue
					// pointing value in array next to j index
					if (userNumber[i] + userNumber[j] + userNumber[k] == 0) {
						System.out.println(userNumber[i] + " " + userNumber[j] + " " + userNumber[k]);
						System.out.println("--------");
						totalCount++;
					}
				}
			}

		}
		System.out.println("Total triplet Possible => " + totalCount);

	}

	/**
	 * Write a program Distance.java that takes two integer command-line arguments x
	 * and y and prints the Euclidean distance from the point (x, y) to the origin
	 * (0, 0).
	 * 
	 * @param x
	 * @param y
	 */
	public static void findEuclidianDistance(int x, int y) {
		// Finding EuclideanDiatance using static squareRoot function of Math class
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("The euclidian distanmce is : --- " + distance);

	}

	/**
	 * Write a Stopwatch Program for measuring the time that elapses between the
	 * start and end clicks
	 * 
	 * @param n
	 */
	public static void getElapsedTime(int n) {
		long starttimer = 0;
		long endtimer = 0;
		long elapsedtime;
		if (n == 1) {
			System.out.println("Press 1 to start ....");
			// using static method of System class to get current time
			starttimer = System.currentTimeMillis();
			System.out.println("Start time is :  " + starttimer);

		}
		System.out.println("Press 2 to get end time : ");
		n = getInt();

		if (n == 2) {
			System.out.println("Press 2 to end .... ");
			endtimer = System.currentTimeMillis();
			System.out.println("end time is :  " + endtimer);
			// Printing Elapsed time
			elapsedtime = (endtimer - starttimer) / 1000;
			System.out.println(" \n Elapsed time is : " + elapsedtime);

		}

	}

	/**
	 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x
	 * + c. Since the equation is x*x, hence there are 2 roots.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadraticEquation(int a, int b, int c) {
		// TODO Auto-generated method stub
		double delta = b * b - 4 * a * c;
		System.out.println(delta);
		// finding roots using formula
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Root of x1 " + r1);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Root of x1 " + r2);
	}

	/**
	 * Write a program WindChill.java that takes two double command-line arguments t
	 * and v and prints the wind chill.
	 * 
	 * @param t
	 * @param v
	 * @return
	 */
	public static double WindChill(double t, double v) {
		return 35.74 + .6215 * t + (.4275 * t - 35.75) * Math.pow(v, .16);
	}

	/**
	 * Write static functions to return all permutation of a String using iterative
	 * method and Recursion method. Check if the arrays returned by two string
	 * functions are equal.
	 * 
	 * @param str
	 * @param lower
	 * @param upper
	 */
	public static void permuteString(String str, int lower, int upper) {

		if (lower == upper) {
			System.out.println(str);
			return;
		}
		for (int i = lower; i <= upper; i++) {
			// call swap function and strored into str
			str = swap(str, lower, i);
			// call permuteString using recursive function
			permuteString(str, lower + 1, upper);
			// call swap function
			str = swap(str, lower, i);
		}

	}

	/**
	 * For swap the string
	 * 
	 * @param str
	 * @param lower
	 * @param upper
	 * @return
	 */
	public static String swap(String str, int lower, int upper) {
		char temp;
		// convert string into characters
		char[] arr = str.toCharArray();
		// swap the characters
		temp = arr[lower];
		arr[lower] = arr[upper];
		arr[upper] = temp;
		// return the swapped string
		return String.valueOf(arr);
	}

	public static void fill(char C, char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = C;
			}
		}
	}

	public static void show(char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean winCheck(char C, char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == C && arr[i][1] == C && arr[i][2] == C) {
				return true;
			} else if (arr[0][i] == C && arr[1][i] == C && arr[2][i] == C) {
				return true;
			}
		}
		if (arr[0][0] == C && arr[1][1] == C && arr[2][2] == C)
			return true;
		else if (arr[2][0] == C && arr[1][1] == C && arr[0][2] == C)
			return true;

		return false;
	}

	/**
	 * Read the Text from a file, split it into words and arrange it as Linked List.
	 * Take a user input to search a Word in the List.
	 * 
	 * @throws Exception
	 */
	public static void unOrderedLinkedList() throws Exception {
		File f = new File("wordlist.txt");

		FileReader fr = new FileReader(f);// Creates File instance and passing file path

		BufferedReader br = new BufferedReader(fr);// Read input file and create character strea

		String str = "";

		String data = "";

		while ((str = br.readLine()) != null) // read from file and stored in string data
		{
			data = data + str;
		}

		String x[] = data.split(" "); // By using split function split array and stored in string array

		LinkedList<String> li = new LinkedList<>();

		for (int i = 0; i < x.length; i++) {
			li.add(x[i]); // Stored string in linkedlist
		}

		Iterator<String> itr = li.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next()); // iterate linkedlist for display
		}

		System.out.println("Enter word for searching in list");
		String S_word = getString();
		if (li.contains(S_word)) {
			li.remove(S_word);
		} else {
			li.add(S_word);
		}
		System.out.println("Data after operation");
		Iterator<String> itrator = li.iterator();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}

		System.out.println("Size of List is= " + li.size());

		System.out.println("Enter List element to find index");
		String item = getString();
		int k = li.indexOf(item);
		System.out.println("Index of list element is=  " + k);
	}

	public static int inputInteger() {
		try {
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}
}
