//Given the first name and last name. Print the last name followed by first character in first name.
//Input : Steve, Jobs
//Output : Jobs,s
package com.banking.strings;
import java.util.Scanner;
public class Last_name_followed_by_first_character_in_first_name
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first text");
		String s1 = scanner.nextLine();
		System.out.println("Enter the Second text");
		String s2 = scanner.nextLine();
		System.out.println(s2  +","+s1.charAt(0));
		
	}
	
}
