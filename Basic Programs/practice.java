

package com.banking;
import java.util.Scanner;
public class practice
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
		int [][] result = new int[row][col];

		//Taking user input
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
			System.out.println("Enter "+i+" row "+j+" Column ");
			arr[i][j] = scanner.nextInt();
			}
			
		}
		int temp = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				a = i;
				b = j;
				temp = a;
				a = b;
				b = temp;
				result[i][j] = arr[a][b];
				
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(result[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
	}


}


