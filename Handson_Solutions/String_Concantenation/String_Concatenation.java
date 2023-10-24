package Cogni_Handson;

import java.util.Scanner;

public class String_Concatenation
{

	public static void main(String[] args)
	{

		   Scanner sca = new Scanner(System.in);
		   System.out.println("Inmate's name : ");
		   String a = sca.nextLine();
		   System.out.println("Inmate's father's name");
		   String b = sca.nextLine();
		   String c = a.concat(" "+b);
		   int x = 0;
		   for(int i=0;i<c.length();i++)
		   {
			   
			   if(Character.isDigit(c.charAt(i)))
			   {
				   System.out.println("Invalid name");
				   break;
			   }
			   else
			   {
				   x++;
			   }
		   }
		   if(x == c.length())
		   {
			   System.out.println(c.toUpperCase());
		   }
	   

	}

}
