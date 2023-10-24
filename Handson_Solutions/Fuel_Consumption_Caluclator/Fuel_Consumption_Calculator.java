package Cogni_Handson;

import java.util.Scanner;

public class Fuel_Consumption_Calculator
{

	public static void main(String[] args)
	{


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		int x = scanner.nextInt();
		System.out.println("Enter the distance covered");
		int y = scanner.nextInt();
		if(x < 0)
		{
			System.out.println(x+" is an Invalid input");
		}
		else if(y < 0)
		{
			System.out.println(y+" is an Invalid input");

		}
		else
		{
			//Print the first condition
			
			double a = (double) x;
			double b = (double) y;

			System.out.println("Liters/100KM");
			double i =  ((a/b)*100);
			System.out.printf("%.2f",i);
			System.out.println();
			
			//Print the Second condition
			
			double miles = (b*0.6214);
			double gallons = (a * 0.2642);
			System.out.println("Miles/gallons");
			double res = (miles/gallons);
			System.out.printf("%.2f",res);
			System.out.println();
		}
	 
	}

}
