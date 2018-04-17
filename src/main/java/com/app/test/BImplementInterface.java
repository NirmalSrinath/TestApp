package com.app.test;

import com.app.test.demo.Ad;

public class BImplementInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.getName();
		b.getDefault();
		Ad.getStatic();
	}

}

class B implements Ad{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name");
	}
	
}