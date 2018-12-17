package com.zengqingfa.javase;

public class StringDemo01 {

	public static boolean huiwen(String str){
		int len=str.length();
		
		for(int i=0;i<len/2;i++){
			if(str.toCharArray()[i] !=str.toCharArray()[len-i-1]){
				return false;
			}
			
		}
		return true;
	
	}
		public static void main(String[] args) {
			String  a="abcgba";
			boolean b=StringDemo01.huiwen(a);		
			System.out.println(b);
			}
	
	

}
