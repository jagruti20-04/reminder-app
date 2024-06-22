package ExceptionHandling;

//import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args) {
		Div obj=new Div();
	try
	{
		obj.division();
		
	}
//	catch(InputMismatchException ie)
//	{
//	  System.err.println("Dear user,Enter float value only....");	
//	}
	catch(ArithmeticException ae)
	{
	  System.err.println("Dear user,Enter nonzero value ....");	
	}
	finally
	{
		 System.out.println("Have a good day....");	
	}

	}

}
