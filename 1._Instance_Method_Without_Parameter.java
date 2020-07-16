package method;

public class Instance_Method_Without_Parameter 
{

	public static void main(String[] args) 
	{
		
		Instance_Method_Without_Parameter obj=new Instance_Method_Without_Parameter();
		obj.disp();   //  calling instance method
		System.out.println("sanjit");

	}

    void disp()    //  instance method
    {
	    int a=10,b=30;   //  local variable
	    int c=a+b;       //  local variable
	    System.out.println("Sum= "+c);
    }
}