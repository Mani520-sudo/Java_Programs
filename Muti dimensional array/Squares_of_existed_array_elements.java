package com.banking;

import java.util.Scanner;

public class Squares_of_existed_array_elements {

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
		int [][] result = new int[row][col];

		//Taking user input and squaring them
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.println("Enter "+i+" row "+j+" Column ");
				arr[i][j] = scanner.nextInt();
				result[i][j] = arr[i][j] * arr[i][j];
			}
			
		}
		
		//printing result array
		
		for (int x =0;x<result.length;x++)
		{
			for(int y=0;y<result[x].length;y++)
			{
				System.out.print(result[x][y] + " ");
			}
			System.out.println();
		}
		
		
		
		
	

	}

}
