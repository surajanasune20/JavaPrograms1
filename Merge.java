package com.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

public class Merge {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int n;
	System.out.println("enter the size of the array");
	n=Utility.getInt();
	String word[]=new String[n];
	System.out.println("Enter the elements ..");
	for(int i=0;i<n;i++)
	{
		word[i]=s.next();
	}
	Utility.sortstring(word,0,word.length-1);
	System.out.println("Sorted elements are..");
	for(int i=0;i<word.length;i++) {
		System.out.println(word[i]);
	}
}
}