//Write a java program to create an array using words at even positions in a string.

package com.banking.strings;
import java.util.Arrays;
import java.util.Scanner;
public class Create_an_array_using_words_at_even_positions_in_a_string
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		String[] arr = s.split(" ");
		int length = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(i%2==0)
			{
				length++;
			}
		}
		String arr2 [] = new String[length];
		int temp = 0;

		for(int i=1;i<arr.length;i+=2)
		{
			for(int j=0;j<arr.length;j++)
			{
				
				arr2[temp] = arr[i];
				break;
				
			}
			temp++;
			
			
		}
		System.out.println(Arrays.toString(arr2));
	
	}
	
}
