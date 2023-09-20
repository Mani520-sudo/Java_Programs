package listinterfaces_assignment;

import java.util.*;

public class Problem_12
{

	public static void main(String[] args) 
	{ 
		List <Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(8);
		al1.add(0);
		al1.add(5);
		al1.add(1);
		al1.add(6);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value that need to be find");
		int a = scanner.nextInt();
		System.out.println("Index of "+a+" is "+al1.indexOf(a));

	}

}
