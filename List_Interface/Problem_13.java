package listinterfaces_assignment;

import java.util.*;

public class Problem_13
{

	public static void main(String[] args)
	{
		List <Integer> al1 = new ArrayList<>();
		List <Integer> al2 = new ArrayList<>();

		al1.add(1);
		al1.add(8);
		al1.add(0);
		al1.add(5);
		al1.add(1);
		al1.add(6);
		for(int i=al1.size()-1;i>=0;i--)
		{
			al2.add(al1.get(i));
		}
		System.out.println("Entered list is "+al1);
		System.out.println("Reversed list is "+al2);
		

	}

}
