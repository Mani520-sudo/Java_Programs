//Given String is paliindrome or not
package com.banking.strings;
import java.util.Scanner;
public class Palindrome_or_not
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.next();
		String s1 = s;
		char[] arr1 = s.toCharArray();
		char[] arr2 = s1.toCharArray();
		int temp = 0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for( int j=((arr1.length-1)-i);j>=0;j-- )
			{
				if(arr1[i] == arr2[j])
				{
					temp++;
					break;
				}
				break;
			}
		}
		if(temp == arr1.length)
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
	
		}
		
		
		
	}
	
}
