import java.util.*;
class Array7  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n,sno;
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the serching element:");
		sno=s.nextInt();
		int r=Arrays.binarySearch(a,sno);
		if(r<0)
		{
			System.out.println("Search element is not found");
		}
		else
		{
			System.out.println("Search element is found\nPosition="+(r+1));
		}

	}
}
