package com.zengqingfa.javase;

public class Father {
	
	static{
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("���๹������");
	}
	
	public Father(){
		System.out.println("���๹�캯��");
	}
	
	public void teacher(){
		{
			System.out.println("�ֲ������");
		}
		
		System.out.println("��ͨ������");
		
	}
}
