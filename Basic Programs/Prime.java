package com.banking;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number need to be checked");
		int num = scanner.nextInt();
		scanner.close();
		int count = 0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
