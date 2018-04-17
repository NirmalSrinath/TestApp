package com.app.test;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new M();
		m.c();
	}

}
class A{
	public void c(){
		System.out.println("patent");
	}
	
}
class M extends A{
public void c(){
	System.out.println("child");
	}
}