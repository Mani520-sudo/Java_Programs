package com.banking.strings;

public class practice

{
	public static void main(String[] args) 
	{
		int n =10;
		char x = 'A';
		char t = x+=(n-1);
		for(int i=0;i<n;i++)
		{
			char y = t;
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(y);
				y++;
			}
			t-=1;
			System.out.println();
		}
	}
}
	