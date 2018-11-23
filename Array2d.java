package com.functionalprograms;

import com.utility.Utility;

public class Array2d {
	
	public static void main(String[] args) {
		//accept rows and coloums
		System.out.println("Enter the number of rows ");
		int m = Utility.getInt();
		System.out.println("Enter no of Column");
		// Taking input for no of column from user
		int n = Utility.getInt();
		//create size array using rows and columns size
		int[][] arr=new int[m][n];
		//accept the array wth rows and coloumns size
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=Utility.getInt();
			}
		}
		Utility.print2dArray(arr);
	

	}

}
