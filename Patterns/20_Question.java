package com.banking.strings;

public class practice

{
	public static void main(String[] args) 
	{
		int n = 20;
		int spaces = (n*2)-2;
		int x1 = n-1;
		int y1 = 2;
		for (int i=1;i<=(2*n);i++)
		{
			if(i<=n)
			{
				//Stars
				for(int j=0;j<i;j++)
				{
					System.out.print("*");
				}
				//Spaces
				for(int j=0;j<spaces;j++)
				{
					System.out.print(" ");
				}
				//Stars
				for(int j=0;j<i;j++)
				{
					System.out.print("*");
				}
				spaces-=2;
				System.out.println();
			}
			else
			{
				//Stars
				for(int j=0;j<x1;j++)
				{
					System.out.print("*");
				}
				//Spaces
				for(int j=0;j<y1;j++)
				{
					System.out.print(" ");
				}
				//Stars
				for(int j=0;j<x1;j++)
				{
					System.out.print("*");
				}
				x1-=1;
				y1+=2;
				System.out.println();
			}
		}
	}
}
	

		

	
	
			




