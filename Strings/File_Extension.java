//Write a java program to print the file extension in the console.
package com.banking.strings;
import java.util.Scanner;
public class File_Extension
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		int temp = s.indexOf(".");
		temp+=1;
		System.out.println(s.substring(temp));
		
	}
	
}
