package listinterfaces_assignment;

import java.util.*;

public class Problem_1
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
		int even_count = 0;
		for(int i=0;i<al.size();i++)
		{
			
				sum+=al.get(i);
			
		}
		System.out.println("Sum is "+sum);
		System.out.println("Sum is "+sum/al.size());
	}

}
