package com.sapient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbccon {

	public boolean check(String name, String pwd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Sapient123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			while (rs.next()) {
				String nam1 = rs.getString(1);
				String nam2 = rs.getString(2);
					System.out.println(nam1 +"  --- "+ nam2);

				if (nam1.equals(name) && nam2.equals(pwd)) {
					return true;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	
	public boolean check1(String name, String pwd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Sapient123");
			PreparedStatement stmt = con.prepareStatement("Insert into person values(?,?)");
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			stmt.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
