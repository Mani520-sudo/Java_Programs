package com.banking.strings;

public class practice

{
	public static void main(String[] args) 
	{
		int n = 100;
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				//stars
				for(int j=0;j<1;j++)
				{
					System.out.print("*");
				}
				//spaces
				for(int j=0;j<n-2;j++)
				{
					System.out.print(" ");
				}
				//stars
				for(int j=0;j<1;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		
		}
	}
}