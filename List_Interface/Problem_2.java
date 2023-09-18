package listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_2
{

	public static void main(String[] args)
	{
		ArrayList <Integer> al = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter "+i+" element");
			int b = scanner.nextInt();
			al.add(b);
		}
		int sum = 0;
		for(int x:al)
		{
			if(x%2==0)
			{
				sum+=x;
			}
		}
		System.out.println("Sum of even numbers is "+sum);
	}

}
