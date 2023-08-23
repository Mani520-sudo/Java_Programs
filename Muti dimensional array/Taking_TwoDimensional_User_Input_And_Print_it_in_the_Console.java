		
		//Take a two dimensional array from the user with row and column sizes and print it in the console
		package com.banking;
		
		import java.util.Scanner;
		
		public class Taking_TwoDimensional_User_Input_And_Print_it_in_the_Console {
		
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
		
				//Taking user input
				for (int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						
						System.out.println("Enter "+i+" row "+j+" Column ");
						arr[i][j] = scanner.nextInt();
					}
					
				}
				
				//Printing it in the console
				for (int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.print(arr[i][j] + " ");
						
					}
					System.out.println();
					
				}
		
				
				
			}
			
			
		}
