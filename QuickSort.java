import java.util.*;
class Quicksort
{	
	static int partition(int arr[], int start, int end)
	{
		int pivot=arr[end];
		int pi=start;
		for(int j=start; j<end; j++)
		{
			if(arr[j]<pivot)
			{
				int temp=arr[pi];
				arr[pi]=arr[j];
				arr[j]=temp;
				pi++;
			}
		}
		int old=arr[pi];
		arr[pi]=arr[end];
		arr[end]=old;
		return pi;
	}
	static void QuickSort(int arr[],int start,int end)
	{
		if(start<end)
		{
			int pi=partition(arr, start, end);
			QuickSort(arr, start, pi-1);
			QuickSort(arr, pi+1, end);
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=scan.nextInt();
		}
		QuickSort(arr,0,N-1);
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}