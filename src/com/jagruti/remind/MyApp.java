package com.jagruti.remind;
import java.sql.*;
import java.util.*;


//import com.jagruti.dbcon.ConnectSp;
import com.jagruti.dbcon.DbConnection;


public class MyApp {
	int id;
	String name,mob,email,password,rtitle,rdesc,rmail;
	
	void register()
	{ Connection con=DbConnection.connect();
	
	    Scanner a=new Scanner(System.in);
		  System.out.println("Enter the name of user:");
		  name = a.next();
		  
		  System.out.println("Enter the mobile no.:");
		  mob = a.next();
		  System.out.println("Enter the email address:");
		  email = a.next();
		  System.out.println("Enter the password:");
		  password = a.next();
		  try
		  {
		     
		     PreparedStatement ps8=con.prepareStatement("insert into user_db values(?,?,?,?,?)");
		    ps8.setInt(1, id);
		    ps8.setString(2,name);
		    ps8.setString(3,mob);
		    ps8.setString(4,email);
		    ps8.setString(5,password);
		 
		  int i=ps8.executeUpdate();
		  System.out.println(i+" record inserted");

	      }
		  catch(Exception e)
		  {
			  System.out.println("failed to Register");
			  e.printStackTrace();
		  }
	}
	void login()
	{
		 Scanner v=new Scanner(System.in);
		 System.out.println("Enter the email address:");
		   email = v.next();
		   Method.setEmail(email);
		  System.out.println("1.Add reminder");
		  System.out.println("2.view my Reminder");
		  System.out.println("3.Delete reminder by id");
		  System.out.println("Enter the enter your choice: ");
		   int ch=v.nextInt();
		   switch(ch)
		   {
		   case 1: addRemind();
		             break;
		   case 2: myRemind();
                   break;
           
		   case 3: deleteById();
                    break;
            default:System.out.println("Invalid input...");
		   }
		  
		  
	}
	void addRemind()
	{    
		Scanner p=new Scanner(System.in); 	
		 System.out.println("Enter the title of reminder:");
		  rtitle = p.next();
		  System.out.println("Enter the description:");
		  rdesc = p.next();
		  rmail = Method.getEmail();
		  try{
		  Connection con=DbConnection.connect();
		  PreparedStatement ps2=con.prepareStatement("insert into reminder_db values(?,?,?,?)");
		  ps2.setInt(1, 0);
		  ps2.setString(2,rtitle);
		  ps2.setString(3,rdesc);
		  ps2.setString(4,rmail);
		  
		 
		  int j=ps2.executeUpdate();
		  System.out.println(j+" Reminder added");
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  System.out.println("Failed to add reminder");
		  }
	}
	void myRemind()
	{   Scanner s=new Scanner(System.in); 
		
		  email = Method.getEmail();
		  try{
			   Connection con=DbConnection.connect();
			   PreparedStatement ps2=con.prepareStatement("select * from reminder_db"); 
			   ResultSet rss=ps2.executeQuery();
			   while(rss.next())
			   { 
			   System.out.println("-----------------------------------------"); 
			   System.out.println("id:" +rss.getInt(1));
			   System.out.println("reminder:" +rss.getString(2));
			   System.out.println("reminder description:" +rss.getString(3));
			  
			   
			   }
		     }
			   
			   catch(Exception e)
			   {
				   System.out.println("failed to snatch.....");
				   e.printStackTrace();
			   }
		   
		  
	}
	void deleteById()
	{   Scanner t=new Scanner(System.in); 
		 rmail = Method.getEmail();
		 System.out.println("Enter the id");
		 id=t.nextInt();
		 try{
			  Connection con=DbConnection.connect();
			  PreparedStatement ps2=con.prepareStatement("Delete from reminder_db where remail=?");
			  ps2.setString(1,rmail);
			 
			  
			  int j=ps2.executeUpdate();
			  System.out.println(j+" data deleted successfully");
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
				  System.out.println("Failed to Delete");
			  }
		  
	}
	

}
