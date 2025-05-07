package com.abhishek.connection;

import java.sql.*;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/ecommerce_cart","root","");
            System.out.print("connected");
        }
        return connection;
    }
}