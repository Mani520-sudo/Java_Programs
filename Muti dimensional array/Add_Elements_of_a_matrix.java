//Add the elements in an array and print it in the console

//In order to add or subtract a matrix the number of rows and columns must be equal.

package com.banking;
import java.util.Scanner;
public class Add_Elements_of_a_matrix
{
	
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
	
	if(row1 * col1 == row2 * col2 )
	{
		//Declaring arrays	
		int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		int[][] result = new int[row2][col2];
		
		
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
					
				System.out.println("Enter "+k+" row "+l+" Column of 2nd Array ");
				arr2[k][l] = scanner.nextInt();
			}
				
		}
		
		//Adding arr1 and arr2 elements to Result Array
		for (int x=0;x<result.length;x++)
		{
			for (int y=0;y<result[x].length;y++)
			{
				
				result[x][y] = arr1[x][y] + arr2[x][y];
				
			}
		}
		
		//Printing the Result array in the console
		for (int u=0;u<result.length;u++)
		{
			for(int v=0;v<result[u].length;v++)
			{
				System.out.print(result[u][v] + " ");
				
			}
			System.out.println();
			
		}
	}
	
	else
	{
		System.err.println("Number of rows and columns of both Arrays must be equal");
		System.err.print("Please enter Again");
	}
	
	
	
	}
}


