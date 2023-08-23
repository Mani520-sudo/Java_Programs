package com.banking;

import java.util.Scanner;

public class Sum_of_elements_of_Multi_Dimensional_array
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// Taking row size from user
		System.out.println("Enter number of rows");
		int row = scanner.nextInt();
		
		// Taking Columns size from user
		System.out.println("Enter number of Columns");
		int col = scanner.nextInt();
		
		//Declaring an array
		int [][] arr = new int[row][col];
		
		int temp = 0;
		//Taking user input and adding the elements to a variable
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.println("Enter "+i+" row "+j+" Column ");
				arr[i][j] = scanner.nextInt();
				temp+=arr[i][j];
			}
			
		}
		
		//Printing the sum of elements
		System.out.println("The sum of elements are " +temp);
	}
}
