package com.banking;

import java.util.Scanner;

public class Squareofn {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base value");
		int base = scanner.nextInt();
		System.out.println("Enter power value");
		int power = scanner.nextInt();;
		int temp =1;
		int i =1;
		while(i<=power)
		{
			temp = temp * base;
			i++;
		}
		System.out.println(temp);
		
		//Using for loop
		System.out.println("Using for loop");
		int temp2=1;
		for(int k=1;k<=power;k++)
		{
			temp2 = temp2 * base;
		}
		System.out.println(temp2);
			
	
	}

}
