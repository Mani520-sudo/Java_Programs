//Write a java program to count the number of words in a String

package com.banking.strings;

import java.util.Scanner;

public class Count_the_number_of_words_in_a_string {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = scanner.nextLine();
		System.out.println(s.trim().split(" ").length);

	}

}
