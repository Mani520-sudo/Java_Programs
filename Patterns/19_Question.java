package com.banking.strings;

public class practice

{
	public static void main(String[] args) 
	{
		int n = 10;
		int x = n;
		int spaces = 0;
		int x1 = 1;
		int y1 = 0;
		for(int i=0;i<(2*n);i++)
		{
			if(i<n)
			{
				//Stars
				for(int j=0;j<x;j++)
				{
					System.out.print("*");
				}
				//Spaces
				for(int j=0;j<spaces;j++)
				{
				System.out.print(" ");
				}
				//Stars
				for(int j=0;j<x;j++)
				{
					System.out.print("*");
				}
				spaces+=2;
				x-=1;
				y1 = spaces-2;
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
				x1+=1;
				y1-=2;
				System.out.println();

			}
			
			
		}
	}
}
	

		

	
	
			




