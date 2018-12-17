package com.zengqingfa.javase;

public class Father {
	
	static{
		System.out.println("父类静态代码块");
	}
	
	{
		System.out.println("父类构造代码块");
	}
	
	public Father(){
		System.out.println("父类构造函数");
	}
	
	public void teacher(){
		{
			System.out.println("局部代码块");
		}
		
		System.out.println("普通方法：");
		
	}
}
