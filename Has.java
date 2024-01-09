class FirstYear
{
	void branch()
	{
		System.out.println("AI&DS");
	}
	void subject()
	{
		System.out.println("C PY PHY");
	}
	void backlogs()
	{
		System.out.println("PHY");
	}
}
class SecondYear 
{
	void subject(){
		FirstYear f1=new FirstYear();
		f1.branch();
		f1.backlogs();
		System.out.println("JAVA DS DBMS");
	}
}
class Has  
{
	public static void main(String[] args) 
	{
		SecondYear s1=new SecondYear();
		s1.subject();
	}
}
