package com.banking;

import java.util.Scanner;

public class nprimenumbersusingforloop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range");
		
		int k = s.nextInt();
		System.out.println("Enter ending range");
		int num = s.nextInt();
		
		
		for(int i=k;i<=num;i++)
		{
			
			int temp = 0;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp+=1;
				}
				
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
		
		
		
		
		
		
		
		

	}

}
