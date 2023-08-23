package com.banking;

import java.util.Scanner;

public class Sumofelementsinarray {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int k = scanner.nextInt();
		int i[] = new int[k];
		int temp = 0;
		
		for (int j=0;j<i.length;j++)
		{
			int a = scanner.nextInt();
			i[j] = a;
			temp+=a;
			
		}
		System.out.println(temp/k);

		


	}

}
