package com.zengqingfa.javase;

public class Son extends Father {
	static{
		System.out.println("���ྲ̬�����");
	}
	
	
	public Son(){
		System.out.println("���๹�캯��");
	}
	
	{
		System.out.println("���๹������");
	}
	
	public static void main(String[] args) {
		
		Father father2=new Son();
		Father father=new Son();
		
	}
}
