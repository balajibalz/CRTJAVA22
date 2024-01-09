import java.util.*;
class Division 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,r;
		System.out.println("Enter two nos:");
		a=s.nextInt();
		b=s.nextInt();
		if(b==0)
		{
			System.out.println("Second no cannot be zero");
			b=1;
		}
		r=a/b;
		System.out.println("division="+r);
	}
}
