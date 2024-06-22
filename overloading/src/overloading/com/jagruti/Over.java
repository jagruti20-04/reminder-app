package overloading.com.jagruti;

import java.util.Scanner;

public class Over {
	Scanner sc=new Scanner(System.in);
	void sum(int x,int y)
	 {
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		 int b=sc.nextInt();
		int c=a+b+x+y;
	    System.out.println("sum is:"+c);  
	 }
	void sum(Double x,Double y)
	 {
		System.out.println("Enter the first number:");
		 double a= sc.nextDouble();
		System.out.println("Enter the Second number:");
		 double b= sc.nextDouble();
		double c=(a+b)*(x+y);
	    System.out.println("sum is:"+c);
	 }
	void sum(String x,String y)
	 {
		System.out.println("Enter the first name:");
		String a= sc.next();
		System.out.println("Enter the Second name:");
		 String b= sc.next();
		String c=a+b;
	    System.out.println("name  is:"+c);
	 }
	void sum(int x,double y)
	 {
		System.out.println("Enter the first number:");
		 int a= sc.nextInt();
		System.out.println("Enter the Second number:");
		 double b= sc.nextDouble();
		double c=a+b+x+y;
	    System.out.println("sum is:"+c);
	 }
	

}
