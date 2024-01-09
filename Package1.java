import java.util.Scanner;
import balaji.Arth;
class Package1 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		a=s.nextInt();
		b=s.nextInt();
		Arth a1=new Arth();
		int r=a1.add(a,b);
		System.out.println("addition="+r);
		System.out.println("product="+a1.mul(a,b));



	}
}
