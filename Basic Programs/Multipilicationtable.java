package com.banking;

import java.util.Scanner;

public class Multipilicationtable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter which mutlipilication table u want");
		int num = scanner.nextInt();
		System.out.println("Enter upto which number u want");
		int op = scanner.nextInt();
		for (int i=1;i<=op;i++)
		{
			System.out.printf("%d * %d = %d \n",num,i,num*i);
		}





	}

}
