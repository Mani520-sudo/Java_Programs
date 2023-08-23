package com.banking;

import java.util.Scanner;

public class nprimenumbersusingforloop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range");
		
		int k = s.nextInt();
		System.out.println("Enter ending range");
		int num = s.nextInt();
		int temp = 0;
		
		
		for(int i=k;i<=num;i++)
		{
			
			//int temp = 0;
			for (int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					temp+=1;
				}
				
			}
			if(temp==2)
			{
				System.out.println(i);
				temp = 0;
				
			}
			else
			{
				temp=0;
			}
		}
		
		
		
		
		
		
		
		

	}

}
