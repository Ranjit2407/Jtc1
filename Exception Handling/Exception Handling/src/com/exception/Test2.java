package com.exception;

import java.net.Socket;

class InvalidServerIdException extends Exception{
	int userId;
	public InvalidServerIdException() {
		
	}
	InvalidServerIdException(int userId) {
		this.userId=userId;
	}
	
    public String getMessage() {
		return "  userId" + userId + "is Invalid";
 	}
	public String toString() {
		return this.getClass().getName() + " : " + getMessage();
		//return "hello exception";
	}
}

class ServerBusyException extends RuntimeException{
	
}
class user{
	void connectToServer(int userId) {
		System.out.println("connecting server...");
		if(userId==101) {
			System.out.println("connected...");
		}else {
			try {
			throw new InvalidServerIdException(userId);
			}catch (InvalidServerIdException e) {
				System.out.println(e);
			}
		}
	}
}


public class Test2 {
	public static void main(String[] args) {
		user ur=new user();
		ur.connectToServer(102);
	}
}
