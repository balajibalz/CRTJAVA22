class Static1 
{
	int a=12;
	static int b=10;
	public static void main(String[] args) 
	{
		Static1 s1=new Static1();
		Static1 s2=new Static1();
		System.out.println(s1.a+" "+s1.b);
		System.out.println(s2.a+" "+s2.b);
		s1.a=23;
		s1.b=45;
		System.out.println(s1.a+" "+s1.b);
		System.out.println(s2.a+" "+s2.b);

	}
}
