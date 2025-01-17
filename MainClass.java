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
