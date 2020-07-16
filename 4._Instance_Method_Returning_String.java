package method;

public class Instance_Method_Returning_String
{

	public static void main(String[] args)
	{

        Name obj=new Name();
        System.out.println("First name: "+obj.fname());
        String lname=obj.lastname("Kumar");
        System.out.println("Last name: "+lname);
		
	}

}
class Name
{
	String fname()    //  instance method without parameter
	{
		String str="Sanjit";  //  local variable
		return (str);
	}
	String lastname(String st)   // instance method with parameter
	{
		String last=st;   //  local variable
		return(last);
	}
}
