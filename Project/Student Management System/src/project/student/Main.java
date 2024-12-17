package project.student;

import java.util.Scanner;

public class Main {
	static Scanner sc;
	static Database database;
	public static void main(String[] args) {
		database=new Database();
		System.out.println("Welcome to library management system\n"
				+"1. Login\n2. New User");
		
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n) {
		case 1: Login();
		case 2: newuser();
		default : System.out.println("Error !");
		}
	}
	
	private static void Login() {
		System.out.println("Enter phone number:");
		String phonenumber=sc.next();
		System.out.println("Enter email:");
		String email=sc.next();
		int n=database.Login(phonenumber, email) 
		if(n !=-1) {
			User user=database.getUser(n);
		}
		else {
			return;
		}
	}
	
	private static void newuser() {
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter phone number:");
		String phonenumber=sc.next();
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("1. Admin\n2. Normal User");
		int n2=sc.nextInt();
		if(n2==1) {
			User admin=new Admin(name,email,phonenumber);
			database.AddUser(admin);
		}
		else {
			User user=new User(name,email,phonenumber);
			database.AddUser(user);
		}
	}
}
