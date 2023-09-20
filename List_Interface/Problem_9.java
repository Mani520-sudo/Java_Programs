package listinterfaces_assignment;

import java.util.*;

public class Problem_9
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> al1 = new ArrayList<>();
		System.out.println("Enter how many prime numbers you want");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++)
		{
			int count= 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count+=1;
				}
				
			}
			if(count==2)
			{
				al1.add(i);
				count = 0;
			}
			else
			{
				count=0;
			}
		}
		System.out.println(al1);
		
	}

}
