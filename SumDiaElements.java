import java.util.*;
class SumDiaElements 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,n,sum=0;
		System.out.println("Enter the size of matrix:");
		n=s.nextInt();
		a=new int[n][n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			if(i==j)
				sum=sum+a[i][j];
			}
		}
		System.out.println("the sum of diagonal elements="+sum);
	}
}
