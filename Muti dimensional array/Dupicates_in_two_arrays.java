//Print the common elements between two arrays.

package com.banking;

import java.util.Scanner;

public class Dupicates_in_two_arrays {

	public static void main(String[] args)
	{

		
		Scanner scanner = new Scanner(System.in);
		
		// Taking row size from user
		System.out.println("Enter number of rows of 1st Array");
		int row1 = scanner.nextInt();
		
		// Taking Columns size from user
		System.out.println("Enter number of Columns of 1st Array");
		int col1 = scanner.nextInt();
		
		System.out.println("Enter number of rows of 2st Array");
		int row2 = scanner.nextInt();
		
		// Taking Columns size from user
		System.out.println("Enter number of Columns of 2st Array");
		int col2 = scanner.nextInt();
		
		int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		
		//Taking user input of 1st array
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				
				System.out.println("Enter "+i+" row "+j+" Column of 1st Array ");
				arr1[i][j] = scanner.nextInt();
				
			}
			
		}
		
		//Taking user input of 2st array
		for (int k=0;k<arr2.length;k++)
		{
			for(int l=0;l<arr2[k].length;l++)
			{
					
				System.out.println("Enter "+k+" row "+l +" Column of 2nd Array ");
				arr2[k][l] = scanner.nextInt();
			}
				
		}
		
		//Iterating both arrays and checking if the first element of first array is present on second array.If present print it (or) Go for second element
		

		for (int x=0;x<arr1.length;x++)
		{
			
			for (int y=0;y<arr1[x].length;y++)
			{
				int temp = arr1[x][y];
				int temp1 = 0;
				
				for (int a=0;a<arr2.length;a++)
				{
					
					for(int b=0;b<arr2[a].length;b++)
					{
						if (arr2[a][b] == temp)
						{
							temp1 = arr2[a][b];
						
						}
					}
					
					if(temp == temp1)
					{
						 
						System.out.println(temp1);
						
						
						break;
						
					}
					else
					{
						temp1 = 0;
					}
			
				}
				
				
			}
			
		}
		
			
	

	}

}
