package method;

public class Calling_Static_Method_in_Instance_Method
{

	public static void main(String[] args) 
	{
		
		addition1 obj=new addition1();
		obj.disp();

	}

}
class addition
{
	static int add()   //  static method
	{
		int x=10,y=20;  //  local variable
		int z=x+y;
		
		return(z);
	}
}
class addition1
{
	void disp()
	{
		int a=addition.add();
		System.out.println("Addition = "+a);
	}
}
