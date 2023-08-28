//Write a java program to to reverse each word of a string

package com.banking.strings;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_each_word_of_a_string
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char[] arr2 = arr[i].toCharArray();
			
			for(int j=arr2.length-1;j>=0;j--)
			{
				System.out.print(arr2[j]);
			}
			System.out.print(" ");
		}
	}
	
}
