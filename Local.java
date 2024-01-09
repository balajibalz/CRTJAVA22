class Local 
{
	int a=10;
	static int b=20;
	void show()
	{
		int c=201;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		//System.out.println("c="+c);
	}
	public static void main(String[] args) 
	{
		Local l=new Local();
		l.show();
		l.display();
	}
}
