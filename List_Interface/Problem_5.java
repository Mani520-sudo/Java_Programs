package listinterfaces_assignment;

import java.util.*;

public class Problem_5 
{
	public static void main(String[] args)
	{
		ArrayList <String> al1  = new ArrayList<>();
		ArrayList <String> al2  = new ArrayList<>();
		ArrayList <String> al3  = new ArrayList<>();
		
//Taking input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			String b = scanner.next();
			al1.add(b);
		}
		
//Storing all duplicates in a new list
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
		
//Filtering and storing (duplicates only once) in a new list
for(int i=0;i<al2.size();i++)
	{
	 if(al3.contains(al2.get(i))==false)
		{
			al3.add(al2.get(i));
		}
	}

//printing duplicates and its count
for(int i=0;i<al3.size();i++)
{
	int c =0;
	for(int j=0;j<al2.size();j++)
	{
		if(al3.get(i).equals(al2.get(j)))
		{
			c+=1;
		}
		
	}
	System.out.println(al3.get(i)+" - "+c);
}


	}
}
