# SpringRegisterEX

Add entities for user registration and login functionality

# Add Login.java
   Defines the Login entity with fields for ID, email, and password.
# Add Register.java
   Defines the Register entity with fields for ID, name, address, email, and password.

# Register Code
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



# Login Code
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

# Main Code
package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Login;
import com.entities.Register;

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Register r = context.getBean("R",Register.class);
		Login l = context.getBean("log", Login.class);
		
		System.out.println(r);
		System.out.println(l);
	}

}

