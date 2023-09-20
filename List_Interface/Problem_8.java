package listinterfaces_assignment;

import java.util.*;

public class Problem_8
{
	public static void main(String[] args)
	{
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first list size");
		int a = scanner.nextInt();
		System.out.println("Enter Second list size");
		int b = scanner.nextInt();
		System.out.println("Enter first list");
		for(int i=0;i<a;i++)
		{
			int a1 = scanner.nextInt();
			al1.add(a1);
		}
		System.out.println("Enter Second list");

		for(int i=0;i<b;i++)
		{
			int b1 = scanner.nextInt();
			al2.add(b1);
		}
		
		//Printing common elements
		for(int i=0;i<al1.size();i++)
		{
			for(int j=0;j<al2.size();j++)
			{
				if(al1.get(i).equals(al2.get(j)))
				{
					al3.add(al1.get(i));
				}
			}
		}
		System.out.println("Common elements are "+al3);
	}
}
