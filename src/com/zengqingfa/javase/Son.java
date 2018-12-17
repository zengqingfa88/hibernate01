package com.zengqingfa.javase;

public class Son extends Father {
	static{
		System.out.println("子类静态代码块");
	}
	
	
	public Son(){
		System.out.println("子类构造函数");
	}
	
	{
		System.out.println("子类构造代码块");
	}
	
	public static void main(String[] args) {
		
		Father father2=new Son();
		Father father=new Son();
		
	}
}
