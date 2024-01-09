class This 
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
		System.out.println("admission no="+admno+" Name="+name);
	}
	public static void main(String[] args) 
	{
		This t=new This();
		t.get(22,"def");
		t.show();
	}
}
