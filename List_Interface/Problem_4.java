package listinterfaces_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_4
{
	public static void main(String[] args)
	{
		ArrayList <Integer> al3 = new ArrayList<>();
		ArrayList <Integer> al1 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the First list");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter "+i+" element");
			int b = scanner.nextInt();
			al1.add(b);
			al3.add(b);
		}
		ArrayList <Integer> al2 = new ArrayList<>();
		System.out.println("Enter the number of elements in the Second list");
		int c = scanner.nextInt();
		for(int i=1;i<=c;i++)
		{
			System.out.println("Enter "+i+" element");
			int d = scanner.nextInt();
			al2.add(d);
			al3.add(d);
		}
		System.out.println("First list is "+al1);
		System.out.println("Second list is "+al2);

		System.out.println("Merged list is "+al3);
	}
}
