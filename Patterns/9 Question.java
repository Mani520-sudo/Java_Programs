9 Question



package com.banking.strings;
public class practice

{
	public static void main(String[] args) 
	{
		int n = 5;
		int a = n-1;
		int spaces = 0;
		int stars1 = 1;
		int stars2 = (2*n)-1;
		for(int i=1;i<=2*n;i++)
		{
		if(i<=n)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(" ");
			}
			//stars
			for(int j=0;j<stars1;j++)
			{
				System.out.print(j+1);
			}
			//spaces
			for(int j=0;j<a;j++)
			{
				System.out.print(" ");
			}
			a--;
			stars1+=2;
		}
		else
		{
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			//stars
			for(int j=0;j<stars2;j++)
			{
				System.out.print(j+1);
			}
			//spaces
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			spaces+=1;
			stars2-=2;
		}
			
			System.out.println();
			
		}
		
	}
}
	

		

	
	
			




