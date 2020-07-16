package method;

public class Static_Method2
{

	public static void main(String[] args)
	{
		
		Check.disp();

	}

}
class Check
{
	static void disp()
	{
		int x=10;
		System.out.println("Value of x: "+x);
	}
}
