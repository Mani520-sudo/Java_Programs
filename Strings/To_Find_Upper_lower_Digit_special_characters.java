package com.banking.strings;
import java.util.Scanner;
public class To_Find_Upper_lower_Digit_special_characters
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		char[] arr = s.toCharArray();
		int upper = 0;
		int lower = 0;
		int digits = 0;
		int special = 0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(Character.isLowerCase(arr[i]))
			{
				lower++;
			}
			else if(Character.isUpperCase(arr[i]))
			{
				upper++;
			}
			else if(Character.isDigit(arr[i]))
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		System.out.println("Uppercase letters "+upper);
		System.out.println("Lowerrcase letters "+lower);

		System.out.println("Digits "+digits);

		System.out.println("Special characters "+special);

		
		
	}
	
}
