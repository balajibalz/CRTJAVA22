class Data 
{
	int a,b;
	void get(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("a="+a+" b="+b);
	}
}
class Addition extends Data
{
	void add()
	{
		System.out.println(a+b);
	}
}
class Mutlipy extends Data
{
	void product(){

	System.out.println(a*b);
}
}
class Hirirachical
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.get(45,23);
		a1.show();
		a1.add();
		Mutlipy m1=new Mutlipy();
		m1.get(12,4);
		m1.show();
		m1.product();

	}
}
