package Cool_Crew;

import java.util.*;

public class UserInterface
{
	public static Specifications mani(String acDetails)
	{
		String x = acDetails;
		String arr[] = x.split(":");
		Specifications s = new Specifications();
		s.setModelNumber(arr[0]);
		s.setAcType(arr[1]);
		s.setBrandName(arr[2]);
		s.setAcColour(arr[3]);
		double y = Double.parseDouble(arr[4]);
		s.setAcCost(y);
		return s;
	}
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter AC Details");
		String h = s1.next();
		Specifications s = mani(h);
		s.cac();
		if(s.cac() == -1)
		{
			System.out.println("Invalid Ac Details");
		}
		else
		{
			System.out.println(s.getModelNumber());
			System.out.println(s.getBrandName());
			System.out.println(s.getAcType());
			System.out.println(s.getAcColour());
			System.out.println(s.getAcCost());
			System.out.println("Amount to be paid by the customer is"+s.cac());
		}
		
	}
}
