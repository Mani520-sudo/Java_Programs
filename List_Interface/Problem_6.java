package listinterfaces_assignment;

import java.util.*;

public class Problem_6 {

	public static void main(String[] args)
	{
		ArrayList <String> al1 = new ArrayList<>();
		ArrayList <String> al2 = new ArrayList<>();
		ArrayList <String> al3 = new ArrayList<>();
		ArrayList <String> al4 = new ArrayList<>();



		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			String b = scanner.next();
			al1.add(b);
		}
		//Find duplicates from the list and adding the duplicates in a new list
		
		for(int i=0;i<al1.size();i++)
		{
			int count = 0;
			for(int j=0;j<al1.size();j++)
			{
				if(al1.get(i).equals(al1.get(j)))
				{
					count+=1;
				}
				
			}
			if(count>1)
			{
				al2.add(al1.get(i));
			}
		}
		
		//Filtering the duplicates and adding them only once in a new list
		for(int i=0;i<al2.size();i++)
		{
			if(al3.contains(al2.get(i))==false)
			{
				al3.add(al2.get(i));
			}
		}
		
		//Finding the highest duplicated element
		int max1 = 0;
		int index = 0;
		for(int i=0;i<al3.size();i++)
		{
			int max = 0;
			for(int j=0;j<al2.size();j++)
			{
				if(al3.get(i).equals(al2.get(j)))
				{
					max+=1;
				}
			}
			if(max>=max1)
			{
				max1=max;
				index = i;
			}
			
		}
		System.out.println("Highest duplicated element is "+al3.get(index)+" Which Repeated "+max1+" Times");
		
		
	}

}
