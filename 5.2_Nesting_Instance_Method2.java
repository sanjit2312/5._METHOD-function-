package method;

public class Nesting_Instance_Method2 
{

	public static void main(String[] args) 
	{
		

		Multi obj=new Multi();
		obj.disp();

	}

}
class Multi
{
	void disp()  //  instance method
	{
		Multi1 obj=new Multi1();   //  calling instance method inside instance method 
		int x=obj.multiplication();
		System.out.println("multiplication= "+x);
	}
}
		
class Multi1
{
	int multiplication()    //  instance method
	{
		int a=10,b=40;
		int z=a*b;
		return(z);
	}

}