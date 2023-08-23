package com.banking;

import java.util.Scanner;

public class nprimenumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upto many number of prime numbers u want");
		int num = s.nextInt();
		
		for(int i=1;i<=num;i++)
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
