class Sample1 
{
	int a,b;
	void get(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
		s1.get(22,33);
		s2.get(11,55);
		s1.show();
		s2.show();

	}

}
