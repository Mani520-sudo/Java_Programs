package com.banking;

import java.util.Scanner;

public class Min_length_word_from_an_array {

	public static void main(String[] args)
	{

	//Creating an array
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter array size");
	int size = scanner.nextInt();
	String[] arr = new String[size];
	System.out.println("Enter elements");
	
	
	//Taking user input and storing it in an array
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = scanner.next();
		
	}
	
	//Checking minimum word and storing the minimum word in a variable p
	String s;
	String p = arr[0];
	for(int j=0;j<arr.length;j++)
	{
		s = arr[j];
		
		if(s.length()<=p.length())
		{
			p = s;
			
		}
	}

	
	//Checking if a duplicate word is presented in the array and print duplicate arrays too if they exist
	String x;
	int l= 0;
	while(l<arr.length)
	{
		x = arr[l];
		if(p.length() == x.length())
		{
			System.out.println("Minimum word is " + x);
			System.out.println("Index number is " + l);
		}
	l++;
	}
}

}
