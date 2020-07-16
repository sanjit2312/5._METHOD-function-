package method;

public class Nesting_Instance_Method1
{

	public static void main(String[] args)
	{
		Add obj=new Add();
		obj.disp();

	}

}
class Add
{
	int add()   //  instance method
	{
		int a=10,b=40; //  local variable
		int z=a+b;   //  local variable
		return(z);
	}
	void disp()   //  instance method
	{
		int x=add();  //  calling instance method inside instance method
		System.out.println("Addition= "+x);
	}
}