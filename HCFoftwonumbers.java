package com.banking;

import java.util.Scanner;

public class HCFoftwonumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int temp2 = 0;
		if (num1>num2)
		{
			temp2 = num1;
			num1 = num2;
			num2 = temp2;
		}
		int temp = 0;
		for(int i=1;i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				temp = i;
			}
		}
		System.out.println(temp);
		

	}

}
