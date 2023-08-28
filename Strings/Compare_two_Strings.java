/*Compare two strings, If character in string 1 is present in string 2 then it should be printed in output with "+" in middle
 * String 1 = New York;
 * String 2 = NWYR;
 * o/p = N+w+Y+r+
*/
package com.banking.strings;
import java.util.Scanner;
public class Compare_two_Strings
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first text");
		String s1 = scanner.nextLine();
		System.out.println("Enter the Second text");
		String s2 = scanner.nextLine();
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(s1.charAt(i)+"+");
				}
			}
		}


		
		
	}
	
}
