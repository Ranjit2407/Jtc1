package project.student;

import java.util.ArrayList;

import javax.security.auth.login.LoginContext;

public class Database {
	ArrayList<User> users=new ArrayList<User>();
	ArrayList<String> usernames=new ArrayList<String>();
	
	public void AddUser(User sc) {
		users.add(sc);
		usernames.add(sc.getName());
	}
	public int Login(String phonenumber, String email) {
		int n=-1;
		for(User sc:users) {
			if(sc.getPhonenumber().matches(phonenumber) && sc.getEmail().matches(email)) {
				n=users.indexOf(sc);
				break;
				
			}
		}
		return n;
	}
	public User getUser(int n) {
		return users.get(n);
	}
}
