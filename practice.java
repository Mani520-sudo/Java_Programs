package com.banking;
import java.util.Scanner;
public class practice {
	
	
public static void main(String[] args)
{

	int temp = 0;
	Scanner scanner = new Scanner(System.in);		
	System.out.println("Enter first number");
	int num1 = scanner.nextInt();
	System.out.println("Enter second number");
	int num2 = scanner.nextInt();
	for (int i=1;i<=num1*num2;i++)
	{
		
		if (num1%i==0 && num2%i==0)
		{
			temp = i;
		
	}
	
}
	System.out.println(temp);






	}
}


