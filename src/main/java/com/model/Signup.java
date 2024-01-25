package com.model;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@ManagedBean(name="user" , eager=true)
public class Signup {
	
	@Size(min=1)
	String username;
	
	@Size(min=1)
	String fname;
	
	@Size(min=1)
	String lname;
	
	@Size(min=10,max=10)
	String mobileno;
	
	@Email
	String email;
	
	@NotNull(message = "{register.pwd.invalid}")
    @Size(min = 8, message = "{register.pwd.invalid}")
	String pwd;
	
	String confirmpwd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConfirmpwd() {
		return confirmpwd;
	}
	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}
	
	
	
	
}
