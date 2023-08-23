package com.banking;

import java.util.Scanner;

public class nprimenumbersusingwhileloop {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range");
		
		int a = s.nextInt();
		System.out.println("Enter ending range");
		int b = s.nextInt();
		
		
		int j = 1;
		int temp = 0;
		while(a <=b)
		{
			
			while(j<=a)
			{
				if(a%j==0)
				{
					temp+=1;
					
				}
				j++;
			}
			if(temp==2)
			{
				System.out.println(a);
				temp = 0;
			}
			else
			{
				temp = 0;
			}
			a++;
			j = 1;
			
			
		}


	}

}
