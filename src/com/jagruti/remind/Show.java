package com.jagruti.remind;
import java.util.*;
public class Show {
     
     static int ap=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyApp s1=new MyApp();
		do
		 {
		System.out.println("-------------Welcome to the Reminder App----------------");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		 {
		   case 1: s1. register();
		           break;
		   case 2: s1. login();
                     break;
           default:System.err.println("invalid input......");
		 }
		System.out.println("Do you want to continue..");
		System.out.println(" 1=yes  0=no");
		
		  ap=sc.nextInt();
	   }while(ap==1);   
	}
	

}
