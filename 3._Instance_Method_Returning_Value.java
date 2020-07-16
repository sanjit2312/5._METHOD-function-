package method;

public class Instance_Method_Returning_Value 
{

	public static void main(String[] args) 
	{
		
		Test obj=new Test();
		System.out.println("Addition= "+obj.add());
		int r=obj.multi(5);
		System.out.println("Multiplication= "+r);

	}

}
class Test
{
	int add()   //  instance method without parameter
	{
		int a=10,b=30;  //  local variable
		int c=a+b;      //  local variable
		return(c);
	}
	int multi(int a)   //  instance method with parameter
	{
		int x=a;       //  local variable
		return(x*x);
	}
}