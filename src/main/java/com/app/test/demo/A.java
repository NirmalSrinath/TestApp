package com.app.test.demo;

import com.app.test.Test1;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 h = new Dog1();
		h.getName();
		h.getName2();

	}

}
class Dog1 extends Test1{  
	int bark(){
		System.out.println("barking...");
		return 0;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("getname : "+ac);
		
	}

	@Override
	protected void getName2() {
		// TODO Auto-generated method stub
		System.out.println("getname1 : "+ca);
	}  
} 