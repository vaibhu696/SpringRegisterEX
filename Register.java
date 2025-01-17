package com.entities;

public class Register {
	
	  private int id;
	  private String name;
	  private String add;
	  private String email;
	  private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Register(int id, String name, String add, String email, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.email = email;
		this.pass = pass;
	}
	public Register() {
		
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", add=" + add + ", email=" + email + ", pass=" + pass + "]";
	}
	  
	  
	  

}
