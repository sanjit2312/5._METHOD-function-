package method;

public class Instance_Method_With_Parameter
{

	public static void main(String[] args)
	{
		
		Instance_Method_With_Parameter obj=new Instance_Method_With_Parameter();
		obj.disp(10,40);   //  calling instance method and passing value
		System.out.println("Sanjit");

	}
	
	void disp(int a,int b)
	{
		
		int x=a,y=b;   //  local variable
		int z=x+y;     //  local variable
		System.out.println("Sum= "+z);
		
	}

}
