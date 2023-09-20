package listinterfaces_assignment;

import java.util.*;

public class Problem_19 {

	public static void main(String[] args)
	{
		// Balanced Expressions
		Stack  <Character>l1 = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Expression");
		String a = scanner.next();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == '(')
			{
				l1.add(a.charAt(i));
			}
			else if(a.charAt(i) == '{')
			{
				l1.add(a.charAt(i));

			}
			else if(a.charAt(i) == '[')
			{
				l1.add(a.charAt(i));

			}
			else if(a.charAt(i) == ')')
			{
				
				if(l1.peek().equals('('))
				{
					l1.pop();
				}
			}
			else if(a.charAt(i) == '}')
			{
				
				if(l1.peek().equals('{'))
				{
					l1.pop();
				}
			}
			else if(a.charAt(i) == ']')
			{
				
				if(l1.peek().equals('['))
				{
					l1.pop();
				}
			}
			
			
		}
		if(l1.isEmpty())
		{
			System.out.println("Balanced Expression");
		}
		else
		{
			System.out.println("Unbalaned Expression");
		}
		scanner.close();
			
	}

}
