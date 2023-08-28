//Write a java program to Remove all starting and ending spaces from a string

package com.banking.strings;
import java.util.Scanner;

public class Remove_all_starting_and_ending_spaces_from_a_string
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		System.out.println(s.trim());
	}
	
}
