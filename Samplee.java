class Samplee 
{
	int a,b;
	void get()
	{
		a=10;
		b=20;
	}
	void show()
	{
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) 
	{
		Samplee s1=new Samplee();
		Samplee s2=new Samplee();
		s1.get();
		s2.get();
		s1.show();
		s2.show();

	}

}
