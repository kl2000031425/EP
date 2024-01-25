package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Query {
	
	public void signup(String name,String fname,String lname,String email,double mno,String pwd) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Achary@123");
		PreparedStatement ps=con.prepareStatement("insert into signup values('"+name+"','"+fname+"','"+lname+"','"+email+"',"+mno+",'"+pwd+"')");
		ps.execute();
	}
	public void deposite(String name,int accno,String password,int amount)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Achary@123");
		PreparedStatement ps=con.prepareStatement("update account set balance = balance +"+amount+" where name='"+name+"',accno="+accno+", password='"+password+"' ");
		ps.executeUpdate();
	}
	public void transfer(String name,int accno,String password,int amount,int tna)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Achary@123");
		PreparedStatement ps=con.prepareStatement("update account set balance = balance -"+amount+" where name='"+name+"',accno="+accno+", password='"+password+"' ");
		PreparedStatement ps2=con.prepareStatement("update account set balance = balance +"+amount+" where accno="+tna+" ");
		ps.executeUpdate();
		ps2.executeUpdate();
	}
}
