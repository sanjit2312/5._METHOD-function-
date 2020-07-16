package method;

public class Method_Overloading2 
{

	public static void main(String[] args)
	{
		Add1 obj=new Add1();
		obj.disp(10);
		obj.disp(25,30);

	}

}
class Add1
{
	void disp(int a)
	{
		int x=a;
		System.out.println("Value of A is "+x);
	}
	void disp(int a,int b)
	{
		int x=a,y=b;
		int z=x+y;
		System.out.println("Addition= "+z);
	}
	
}
