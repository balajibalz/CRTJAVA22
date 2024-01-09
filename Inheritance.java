class First
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m2 method");
	}
}
class Second extends First
{
	void m3()
	{
		System.out.println("m3 method");
	}
}
class Inheritance  
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}
