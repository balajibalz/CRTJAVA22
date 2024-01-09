class Student
{
	int admno;
	String name;
	void get(int x,String y)
	{
		admno=x;
		name=y;

    }
	void show()
	{
		System.out.println("admission no="+admno+" Name="+name);
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.get(11,"bbb");
		s1.show();
		Student s2=new Student();
		s2.get(22,"kkk");
		s2.show();
		
	}
}
