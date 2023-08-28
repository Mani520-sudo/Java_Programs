//Write a java program to reverse a string

package com.banking.strings;
import java.util.Scanner;

public class Reverse_a_string {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		char[] arr = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
