class ConstructorPara
{
	int admno;
	String name;
	ConstructorPara(int x,String y)
	{
		admno=x;
		name=y;
	}
	void show()
	{
		System.out.println("Adimission no="+admno+" Name="+name);
	}
	public static void main(String[] args) 
	{
		ConstructorPara p=new ConstructorPara(11,"cdhcbw");
		p.show();
	}
}
