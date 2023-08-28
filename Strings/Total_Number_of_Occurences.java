//Write a java program to count the total number of occurrences of a given character in a string.

package com.banking.strings;

import java.util.Scanner;

public class Total_Number_of_Occurences
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		System.out.println("Enter the character you want to find");
		char s1 = scanner.next().charAt(0);
		int temp = 0;
		char[] arr = s.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i] == s1)
			{
				temp++;
			}
		}
		
		if(temp == 0)
		{
			System.out.println("No character found");
		}
		
		else
			{
			System.out.println("Character " + s1 +" repeated "+ temp+" times");
			}
		
	}
}
