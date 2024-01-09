class Sample3 
{
	void m1()
	{
		System.out.println("Instance Method");
	}
	static void m2()
	{
		System.out.println("static Method");
	}
	public static void main(String[] args) 
	{
		//Sample3.m1();
		Sample3.m2();
		Sample3 s1=new Sample3();
		s1.m1();
		s1.m2();
	}
}
