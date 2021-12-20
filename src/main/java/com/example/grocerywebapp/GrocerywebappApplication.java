package com.example.grocerywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrocerywebappApplication {

	public static void main(String[] args) {
		try
		{
			SpringApplication.run(GrocerywebappApplication.class, args);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Port 8080 in use you need to terminate first 8080 port through CMD");
		}
		finally {
			
			System.out.println("If any technical issue or any update needed regards project contact administrator ");
		}
	}

}
