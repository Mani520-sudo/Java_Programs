package listinterfaces_assignment;

import java.util.ArrayList;
import java.util.List;

public class Problem_15 {

	public static void main(String[] args)
	{
		List <Integer> al1 = new ArrayList<>();
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
		
		//Find duplicates of the numbers and storing the count in a count variable
		//If the count is equal to 1, then it is the first non repeating character and we will print and end the loop.
		for(int i=0;i<al1.size();i++)
		{
			int count =0;
			for(int j=0;j<al1.size();j++)
			{
				if(al1.get(i).equals(al1.get(j)))
				{
					count+=1;
				}
			}
			if(count == 1)
			{
				System.out.println("First non repeating character is "+al1.get(i));
				break;
			}
		}
	}

}
