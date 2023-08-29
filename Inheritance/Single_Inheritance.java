package com.banking.inheritance;

class cal
{
	public void add(int a,int b )
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
class cal2 extends cal
{
	public void multi(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
}


public class Single_Inheritance
{

	public static void main(String[] args)
	{
		cal2 obj = new cal2();
		obj.add(2,3);
		obj.sub(2,3);
		obj.multi(2,3);
		obj.div(2,3);
	}

}
