package listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_3 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> al = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter even length only");
		System.out.println("Enter the number of elements in the list");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter "+i+" element");
			int b = scanner.nextInt();
			al.add(b);
		}
		ArrayList <Integer> First_List = new ArrayList<>();
		ArrayList <Integer> Second_List = new ArrayList<>();
		int halfsize = al.size()/2;
		for(int i=0;i<halfsize;i++)
		{
			First_List.add(al.get(i));
		}
		for(int i=halfsize;i<al.size();i++)
		{
			Second_List.add(al.get(i));
		}
		System.out.println("Entered List is "+al);
		System.out.println(First_List);
		System.out.println(Second_List);
	}
}
