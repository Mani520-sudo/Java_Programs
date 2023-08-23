package com.banking;

import java.util.Scanner;

public class Maximum_number_in_array {

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		int max = 0;

		System.out.println("Enter Elements ");
		for(int j=0;j<size;j++)
		{
			arr[j] = scanner.nextInt();
		}


		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
				
			}
		}
		System.out.println("Maximum number is " + max);

		for (int k=0;k<arr.length;k++)
		{
			if (arr[k]==max)
			{
				System.out.println("Index number is " + k);
			}
		}
	}

}
