class ThisConstructor 
{
	int admno;
	String name;
	ThisConstructor(int admno,String name)
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
		ThisConstructor t=new ThisConstructor(22,"ffv");
		t.show();
	}
}
