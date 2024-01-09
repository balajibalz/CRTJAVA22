class UserDefConstructer 
{void m1()
	{
		System.out.println("m1 method");
	}
	 UserDefConstructer()
	{
		 System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		 UserDefConstructer u=new  UserDefConstructer();
		  UserDefConstructer u1=new  UserDefConstructer();
		  u.m1();
	}
}
