import java.util.*;
class Positive  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=s.nextInt();
		if(a==0)
		{
			System.out.println(a+" is Zero");
		}
		else
		{
			if(a>0)
			{
				System.out.println(a+" is positive");
			}
			else
			{
				System.out.println(a+" is negative");
			}
		}



	}
}
