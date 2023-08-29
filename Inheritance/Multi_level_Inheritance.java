package com.banking.inheritance;

class a
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
class b extends a
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

class c extends b
{
	public void pow(int a,int b)
	{
		int temp = 1;
		for(int i=0;i<b;i++)
		{
			temp = temp * a;
		}
		System.out.println(temp);
	}
}


public class Multi_level_Inheritance
{

	public static void main(String[] args)
	{
		c obj = new c();
		obj.add(2,3);
		obj.sub(2,3);
		obj.multi(2,3);
		obj.div(2,3);
		obj.pow(4,2);
	}

}
