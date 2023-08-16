package com.banking;

import java.util.Scanner;

public class Fibonaccinseries {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many number of fibonacci numbers u want ");
		int range = scanner.nextInt();
		int temp = 0;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		
		for (int i=1;i<=range-2;i++)
		{
			
			temp = a+b;
			// if u want a condition like " I need up to 30 only , then u can add a break statement below"
			System.out.println(temp);
			a = b;
			b = temp;
		
			
		}


	}

}



