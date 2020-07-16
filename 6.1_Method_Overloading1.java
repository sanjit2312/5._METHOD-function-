package method;

public class Method_Overloading1
{

	public static void main(String[] args)
	{

		AddMul obj=new AddMul();
		obj.disp(5,12.0f);
		obj.disp(10, 20);
		
	}

}
class AddMul
{
	void disp(int a,int b)
	{
		int x=a,y=b;
		int z=x+y;
		System.out.println("Addition= "+z);
	}
	void disp(int a,float b)
	{
		int x=a;
		float y=b;
		float z=x*y;
		System.out.println("Multiplication= "+z);
	}
}
