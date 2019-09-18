import java.util.*;
class Recur
{
	static int factorial(int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		return (a*factorial(a-1));
	}
	static int power(int b, int x)
	{
		int k=1;
		if(b!=0)
		{
			for(int i=0;i<x;i++)
			{
				k=k*b;
			}
			return k;
		}
		else 
		return 0;
	}
	public static void main(String args[])
	{
		int fact=factorial(3);
		int pow=power(7,3);
		System.out.println(fact);
		System.out.println(pow);
	}
	
}