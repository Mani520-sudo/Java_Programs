package com.banking;

import java.util.Scanner;

public class Sum
{
	static int num1;
	static int num2;
	static String s;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		System.out.println("Enter First number");
		num1 = scanner.nextInt();
		System.out.println("Enter Second number");
		num2 = scanner.nextInt();
		System.out.println("Enter Operation to be performed");
		s = scanner.next();
		scanner.close();
		switch (s)
		{
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}
}
