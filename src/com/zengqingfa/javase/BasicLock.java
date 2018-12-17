package com.zengqingfa.javase;

public class BasicLock {
	 public static void main(String[] args) {
		LockDemo aa=new LockDemo(true);
		LockDemo bb=new LockDemo(false);
		new Thread(aa).start();
		new Thread(bb).start();
	}
}
