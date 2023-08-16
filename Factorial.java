package com.banking;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//Take user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the factorial number"); 
		int num = s.nextInt();
		s.close();
		
		//Take a temp variable to store the values
		
		int temp = 1;
		int i  =1;
		
		//Run a while loop
		while(i<=num)
		{
			temp=temp*i;
			i++;
					
		}
		
		//Print result
		
		System.out.println(temp);
		
		//Using for loop
		System.out.println("For loop result");
		int temp2 = 1;
		for(int k=1;k<=num;k++)
		{
			temp2=temp2*k;
		}
		System.out.println(temp2);
	}

}
