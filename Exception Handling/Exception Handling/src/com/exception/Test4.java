package com.exception;
class window implements AutoCloseable{
	window(){
		System.out.println("Opening window...");
	}
	public void close() {
		System.out.println("closing window");
	}
}
class Room implements AutoCloseable{
	Room(){
		System.out.println("Opening room...");
	}
	public void close() {
		System.out.println("closing room");
	}
}


public class Test4 {
	public static void main(String[] args) {
//		Room r1=null;
//		window w1=null;
		try(Room r1=new Room();window w1=new window();) {
//			r1=new Room();
//			w1=new window();
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
//		finally {
//			w1.close1();
//			r1.close1();
//		}
	}
}
