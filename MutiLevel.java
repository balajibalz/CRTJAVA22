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
		
	}

}
class Results extends Marks
{
	void showResult()
	{
		System.out.println("Total="+(mat+phy+che));
		System.out.println("Average="+(mat+phy+che)/3);
	}
}
class MutiLevel
{
	public static void main(String[] args) 
	{
		Results r1=new Results();
		r1.get(111,"eee");
		r1.show();
		r1.getMarks(89,78,90);
		r1.showMarks();
		r1.showResult();
		
	}
}
