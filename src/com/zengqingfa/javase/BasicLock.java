package com.zengqingfa.javase;

public class BasicLock {
	 public static void main(String[] args) {
		 System.out.println("123321321");
		LockDemo aa=new LockDemo(true);
		LockDemo bb=new LockDemo(false);
		new Thread(aa).start();
		new Thread(bb).start();
	}
}
