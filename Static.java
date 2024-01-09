class Static 
{
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println(Static.a);
		Static s1=new Static();
		System.out.println(s1.a);
	}
}
