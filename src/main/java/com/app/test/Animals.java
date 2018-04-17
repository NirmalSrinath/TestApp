package com.app.test;

public class Animals{  
	void eat(){
		String sd = "12345";
		sd.charAt(1);
		System.out.println("lll   "+sd.toCharArray());
		char[] sc = sd.toCharArray();
		for(char sg:sc){
			System.out.println("eating..."+sg);
		}
		System.out.println("eating..."+sc.toString());
	} 
	
	int eat(int i){
		String sd = "12345";
		sd.charAt(1);
		System.out.println("lll   "+sd.toCharArray());
		char[] sc = sd.toCharArray();
		for(char sg:sc){
			System.out.println("eating..."+sg);
		}
		System.out.println("eating..."+sc.toString());
		return i;
	}  
}  