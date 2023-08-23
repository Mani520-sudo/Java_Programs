
// Create an array on mentioned conditions and print it in the console
// If arr1[i][j] == arr[i][j] print "1". Else "0'
package com.banking;
import java.util.Scanner;
public class Print_Array_Based_on_Mentioned_Conditions
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
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				if(arr1[i][j] == arr2[i][j])
				{
					result[i][j] = 1;
				}
				else
				{
					result[i][j] = 0;
				}
				
			}
		}
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}


}


