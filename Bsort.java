import java.util.*;
class Bsort
{	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
				for(int m=0;m<n;m++)
				System.out.print(arr[m]+" ");
				System.out.println();
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}