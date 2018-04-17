package com.app.test;

import com.app.model.User;

public class TestApi {

	final static int sd=1;
	public static void main(String[] args) {
		TestApi1 sf = new TestApi1();
		System.out.println("hai "+sf.getApi().getAddres());
		int k =10;
		System.out.println(10%2);
		System.out.println(10/2);
	}

}

class TestApi1 {
	
public User getApi(){
	final User usr = new User();
	usr.setAddres("asadasas");
	return usr;
}
	

}