import java.util.*;
class Array4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n,sum=0;
		float avg;
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=(float)sum/n;
		System.out.println("the sum ="+sum);
		System.out.println("the average="+avg);


	}
}
