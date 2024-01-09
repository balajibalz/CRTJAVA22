class First 
{
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
	void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
}
class Second extends First
{
	void add(int x,int y,int z,int w)
	{
		System.out.println(x+y+z+w);
	}
}
class OverloadingInheritance
{

	public static void main(String[] args) 
	{
		Second s1=new Second();
		s1.add(12,15);
		s1.add(33,12,34);
		s1.add(2,4,6,7);
	}
}
