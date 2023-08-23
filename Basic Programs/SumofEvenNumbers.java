package com.banking;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = scanner.nextInt();
		System.out.println("Enter Second number");
		int num2 = scanner.nextInt();
		int temp = 0;
		while(num1<=num2)
		{
			if(num1%2==0)
			{
				temp+=num1;
			}
		num1++;
		}
	System.out.println(temp);
	}

}


//Using For loop
/*
 * 
 * public static void main(String[] args)
{
	int num1 = 10;
	int temp = 0;
	for(int i=1;i<=num1;i++)
	{
		if(i%2==0)
		{
			temp+=i;
			
		}
	}
	System.out.println(temp);
	
}
}
 * 
 * 
 */
