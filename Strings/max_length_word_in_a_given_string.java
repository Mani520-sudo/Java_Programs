// Write a java program to find the max-length word in a given string (If two words are of same length then return the first occuring word of maximum length).
package com.banking.strings;
import java.util.Scanner;
public class max_length_word_in_a_given_string
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		String[] arr = s.split(" ");
		String temp = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length() > temp.length())
			{
				temp = arr[i];
			}
		}
		for( String var : arr)
		{
			if(var.length() == temp.length())
			{
				System.out.println(var);
				break;
			}
			
		}
		
		
	}
	
}
