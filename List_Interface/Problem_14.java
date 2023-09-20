package listinterfaces_assignment;

import java.util.*;

public class Problem_14
{

	public static void main(String[] args)
	{
		List <Integer> al1 = new ArrayList<>();
		List <Integer> al2 = new ArrayList<>();
		List <Integer> al3 = new ArrayList<>();
		List <Integer> al4 = new ArrayList<>();
		
		al1.add(4);
		al1.add(1);
		al1.add(9);
		al1.add(4);
		al1.add(8);
		al1.add(0);
		al1.add(5);
		al1.add(8);
		al1.add(1);
		al1.add(8);
		al1.add(6);
		al3.addAll(al1);
	System.out.println("Entered list is "+al1);
		
		int a = al1.size();
		
		//Ascending order 
		for(int i=0;i<a;i++)
		{
			int min1 = al1.get(0);
			int index1 = 0;
			for(int j=0;j<al1.size();j++)
			{
				if(al1.get(j) < min1)
				{
					min1 = al1.get(j);
					index1 = j;
				}
				
			}
			
			al2.add(min1);
			al1.remove(index1);
			
		}
		System.out.println("Ascending order of list is "+al2);
		
		//Descending order
		for(int i=0;i<a;i++)
		{
			int max1 = al3.get(0);
			int index1 = 0;
			for(int j=0;j<al3.size();j++)
			{
				if(al3.get(j) > max1)
				{
					max1 = al3.get(j);
					index1 = j;
				}
				
			}
			
			al4.add(max1);
			al3.remove(index1);
			
		}
		System.out.println("Descending order of list is "+al4);

		
		}
		
	

}
