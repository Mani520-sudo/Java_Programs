package listinterfaces_assignment;

import java.util.*;

public class Problem_10
{

	public static void main(String[] args) 
	{
		List <Integer> al = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many items u want in the list");
		int a = scanner.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<a;i++)
		{
			int b = scanner.nextInt();
			al.add(b);
		}
		
		System.out.println("Entered list is "+al);
		
		//Using for loop
		int[] arr = new int[al.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = al.get(i);
		}
		System.out.println("Array using for loop "+Arrays.toString(arr));
		
		//Using default method
		al.toArray();
		System.out.println("Array using default method "+al);
		
	}

}
