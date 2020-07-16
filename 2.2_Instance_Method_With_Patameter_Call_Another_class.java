package method;

public class Instance_Method_With_Patameter_Call_Another_class
{

	public static void main(String[] args)
	{
		
		sum obj=new sum();
		obj.disp(20,40);

	}

}
class sum
{
	void disp(int a,int b)
	{
	/*	int x=a;
		int y=b;
		int z=a+b;  */
		System.out.println("Sum= "+(a+b));


	}

}
