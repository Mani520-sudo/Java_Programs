/*Write a java program to modify the string in the following pattern
*Change odd words to Uppercase() and reverse the even numbers
*/
package com.banking.strings;
import java.util.Scanner;
public class Odd_words_to_Uppercase_and_reverse_the_even_numbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i].toUpperCase());
			}
			else
			{ 
				char[] arr2 = arr[i].toCharArray();
				for(int j=arr[i].length()-1;j>=0;j--)
				{
					System.out.print(arr2[j]);
				}
			}
			System.out.print(" ");
		}
	}
	
}
