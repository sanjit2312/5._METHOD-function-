package method;

public class Static_Method_Can_Use_Static_Variable
{

	int a=10;  //  instance variable
	static int x=20;  //  static variable
	
	public static void main(String[] args)
	{
		
		int y=30;  //  local variable
		System.out.println("static variable x: "+x);
		System.out.println("instance variable y: "+y);
		
	}

}
