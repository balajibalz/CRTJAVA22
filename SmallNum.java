import java.util.*;
class SmallNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers:");
        a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			System.out.println(a+" is Biggest");
			}
		    else
		    {
				System.out.println(c+" is Biggest");
			}
		}
		else
		{
			if(b>c)
			{
			System.out.println(b+" is smallest");
	        }
			else
			{
			System.out.println(c+" is Biggest");
			}
		}
	}
}
