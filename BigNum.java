import java.util.*;
class BigNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two nos:");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+" "+"is biggest");
		}
		else
		{
		System.out.println(b+" "+"is biggest");
		}
	}
}
