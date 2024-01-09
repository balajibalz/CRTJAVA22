import java.util.*;
class TransposeMatrix  
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
		System.out.println("The matrix");
		for(i=0;i<m;i++)
		{
			for (j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The transpose of matrix");
		for(i=0;i<n;i++)
		{
			for (j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}
}
