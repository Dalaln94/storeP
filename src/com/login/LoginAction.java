package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;





import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	/**
	 * Login Action
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	   private String password;
	   private String name,email;
	   private String userName;

	public String execute(){
		 String ret = ERROR;
	      Connection conn = null;
	     

	      try {
	        
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paddy","root", "root");
	         
	        
	        
	         
	         PreparedStatement ps = conn.prepareStatement("SELECT name FROM user WHERE userName = ? AND password = ?");
	         ps.setString(1, userName);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();

	         while (rs.next()) {
	        	 name = rs.getString(1);
	             if(name.equalsIgnoreCase("Frank Doyle")){
	             	return  "success1";
	             }else
	             ret = SUCCESS;
	         } 
				
	      } catch (Exception e) {
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return ret;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
