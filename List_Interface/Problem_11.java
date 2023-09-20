package listinterfaces_assignment;

import java.util.*;

public class Problem_11 {

	public static void main(String[] args)
	{
		List <Integer> al1 = new ArrayList<>();
		List <Integer> al2 = new ArrayList<>();
		al1.add(4);
		al1.add(9);
		al1.add(8);
		al2.add(4);
		al2.add(1);
		al2.add(9);
		al2.add(4);
		al2.add(8);
		al2.add(0);
		al2.add(5);
		al2.add(1);
		al2.add(8);
		al2.add(6);
		for(int i=0;i<al1.size();i++)
		{
			for(int j=0;j<al2.size();j++)
			{
				if(al1.get(i).equals(al2.get(j)))
				{
					al2.remove(j);
				}
			}
		}
		System.out.println(al2);
		}

}
