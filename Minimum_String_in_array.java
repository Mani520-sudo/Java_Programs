package com.banking;

import java.util.Scanner;

public class Minimum_number_in_array {

	public static void main(String[] args)
	{


		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		

		System.out.println("Enter Elements ");
		for(int j=0;j<size;j++)
		{
			arr[j] = scanner.nextInt();
		}

		int min = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<min)
			{
				min = arr[i];
				
			}
		}
		System.out.println("Minimum number is " + min);

		for (int k=0;k<arr.length;k++)
		{
			if (arr[k]==min)
			{
				System.out.println("Index number is " + k);
			}
		}



	}

}
