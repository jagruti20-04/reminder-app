package ExceptionHandling;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class Div {
	double a,b,c;
	Scanner sc=new Scanner(System.in);
	void division() 
	//throws InputMismatchException,ArithmeticException
	{
		System.out.println("Enter the first number:");
		a=sc.nextDouble();
		System.out.println("Enter the Second number:");
		b=sc.nextDouble();
		if(b==0)
		{
			ArithmeticException ae =new ArithmeticException();
			throw ae;
			
			
		}
		c=a/b;
		System.out.println("Result:"+c);
		
	}

}
