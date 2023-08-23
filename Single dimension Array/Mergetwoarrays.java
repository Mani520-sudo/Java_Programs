package com.banking;

import java.util.Scanner;

public class Mergetwoarrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array 1 size");
		int a1 = scanner.nextInt();
		System.out.println("Enter array 2 size");
		int a2 = scanner.nextInt();
		
		String a [] = new String[a1];
		String b [] = new String[a2];
		String o [] = new String[a1+a2];
		System.out.println("Enter First array");
		for (int i=0;i<a.length;i++)
		{
			
			a[i] = scanner.next();
			o[i] = a[i];
			
		}
		System.out.println("Enter Second array");
		for (int j=0;j<b.length;j++)
		{
			b[j] = scanner.next();
			o[j+a.length] = b[j];
			
		}
		System.out.println("Merged array is ");
		for(int k=0;k<o.length;k++) 
		{
			System.out.println(o[k]);
		}


	}

}
