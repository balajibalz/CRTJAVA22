class Student
{
	int admno;
	String name;
	void get(int admno,String name)
	{
		this.admno=admno;
		this.name=name;
	}
	void show()
	{
		System.out.println("Admission no.="+admno+"\nName="+name);
	}
} 
class Marks extends Student
{
	int mat,phy,che;
	void getMarks(int mat,int phy,int che)
	{
		this.mat=mat;
		this.phy=phy;
		this.che=che;
	}
	void showMarks()
	{
		System.out.println("Maths="+mat);
		System.out.println("Physics="+phy);
		System.out.println("Chemistry="+che);
		System.out.println("Total="+(mat+phy+che));
		System.out.println("Average="+(mat+phy+che)/3);
	}
}
class Single
{
	public static void main(String[] args) 
	{
		Marks m1=new Marks();
		m1.get(111,"eee");
		m1.show();
		m1.getMarks(89,78,90);
		m1.showMarks();
		
	}
}
