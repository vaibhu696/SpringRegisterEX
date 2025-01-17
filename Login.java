package com.entities;

public class Login {
	
	  private int l_id;
	  private String l_email;
	  private String l_pass;
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_email() {
		return l_email;
	}
	public void setL_email(String l_email) {
		this.l_email = l_email;
	}
	public String getL_pass() {
		return l_pass;
	}
	public void setL_pass(String l_pass) {
		this.l_pass = l_pass;
	}
	@Override
	public String toString() {
		return "Login [l_id=" + l_id + ", l_email=" + l_email + ", l_pass=" + l_pass + "]";
	}
	public Login(int l_id, String l_email, String l_pass) {
		
		this.l_id = l_id;
		this.l_email = l_email;
		this.l_pass = l_pass;
	}
	public Login() {
		
	}
	  
	  

}
