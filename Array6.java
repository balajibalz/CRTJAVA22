import java.util.*;
class Array6  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n;
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The elements before sorting:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println("The elements after sorting:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}


	}
}
