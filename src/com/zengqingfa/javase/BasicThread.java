package com.zengqingfa.javase;



class LockDemo implements Runnable {
	public static final Object AA=new Object();
	public static final Object BB=new Object();
	private boolean flag;
	public LockDemo(boolean flag){
		this.flag=flag;
	}
	public void run() {
		if(flag){
			synchronized (AA) {
				System.out.println("if....AA...LOCK");
				synchronized (BB) {
					System.out.println("if....BB...LOCK");
				}
			}
		}else{
			synchronized (BB) {
				System.out.println("if.......BB.......Lock");
				synchronized (AA) {
					System.out.println("if.....AA......lock");
				}
			}			
		}		
	}
}
 










public class BasicThread {
	
}
