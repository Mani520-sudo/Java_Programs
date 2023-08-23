package com.banking;

import java.util.Scanner;

public class Sumofnnaturalnumbers {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter upto how many natural numbers sum you want");
		int num = scanner.nextInt();
		if(num<=0) {
			System.out.println("please enter natural number greater or equal to one");
			num = 0;
		}
		else {
			int temp = 0;
			for(int i=1;i<=num;i++)
			{
				temp+=i;
			}
			System.out.println(temp);
			
		//Using Formulaaa

		int temp2 = (num*(num+1))/2;
		System.out.println(temp2);
		
		}


	}

}
