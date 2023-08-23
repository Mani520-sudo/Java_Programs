package com.banking;

import java.util.Scanner;

public class Lcmoftwonumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 =scanner.nextInt();
		System.out.println("Enter Second number");
		int num2 = scanner.nextInt();
		for (int i=2;i<=num1*num2;i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
