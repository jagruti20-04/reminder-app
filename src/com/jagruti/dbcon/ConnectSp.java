package com.jagruti.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSp {
			static Connection con=null;
		public static Connection connect()
		{
			if(con==null)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/r3sys","root","");
				}
				catch(Exception e)
				{
					System.err.println("Something went wrong...");
					System.out.println("connection is not establish");
				}
			}
			return con;
		}
		

	}


