package com.datastructureprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
	static class FillPrime
	{
	     
	    boolean isPrime(int n) // Function for checking whether a number is prime or not
	    {
	        int c = 0;
	        for(int i = 1; i<=n; i++)
	        {
	            if(n%i == 0)
	                c++;
	        }
	        if(c == 2)
	            return true;
	        else
	            return false;
	    }
	     
	   public static void main(String args[])throws IOException
	   {
	       FillPrime ob = new FillPrime();
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	       System.out.print("Enter the number of rows: ");
	       int m=Integer.parseInt(br.readLine());
	       System.out.print("Enter the number of columns: ");
	       int n=Integer.parseInt(br.readLine());
	        
	       int A[][]=new int[m][n]; // 2D array for storing 'm*n' prime numbers
	       int B[] = new int [m*n]; // 1D array for storing 'm*n' prime numbers
	        
	       int i = 0, j;
	       int k = 1; // For generating natural numbers
	        
	       /* First saving the 'm*n' prime numbers into a 1D Array */
	       while(i < m*n)
	       {
	           if(ob.isPrime(k)==true)
	           {
	                   B[i] = k;
	                   i++;
	           }
	           k++;
	       }
	        
	       /* Saving the 'm*n' prime numbers from 1D array into the 2D Array */
	       int x = 0;
	       for(i=0; i<m; i++)
	        {
	           for(j=0; j<n; j++)
	           {
	               A[i][j] = B[x];
	               x++;
	           }
	        }
	             
	       /* Printing the resultant 2D array */
	       System.out.println("The Filled Array is :");
	       for(i=0; i<m; i++)
	        {
	            for(j=0; j<n; j++)
	                {
	                    System.out.print(A[i][j]+"\t");
	                }
	            System.out.println();
	        }
	   }
	}
}