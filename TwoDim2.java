import java.util.*;
class TwoDim2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,m,n;
		System.out.println("Enter the no. of rows & columns:");
		m=s.nextInt();
		n=s.nextInt();
		a=new int[m][n];
		System.out.println("Enter the elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("The elemts of matrix");
		for (i=0;i<m;i++)
		{
			for (j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
