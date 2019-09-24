import java.util.*;
class Mergesort
{
	static void Merge(int arr[], int start, int m, int end)
	{
		int n1= m-start+1;
		int n2= end-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0; i<n1; i++)
		{
			L[i]=arr[start+i];
		}
		for(int j=0; j<n2; j++)
		{
			R[j]=arr[m+j+1];
		}
		int x=0, y=0, z=start;
		while(x<n1 && y<n2)
		{
			if(L[x]<R[y])
			{
				arr[z]=L[x];
				x++;
			}
			else
			{
				arr[z]=R[y];
				y++;
			}
			z++;
		}
		while(x<n1)
		{
			arr[z]=L[x];
			x++;
			z++;
		}
		while(y<n2)
		{
			arr[z]=R[y];
			y++;
			z++;
		}
	}
	static void Mergesort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int m= (start+end)/2;
			Mergesort(arr, start, m);
			Mergesort(arr, m+1, end);
			Merge(arr, start, m, end);
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		Mergesort(arr, 0, N-1);
		for(int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}