package com.app.test.demo;

public interface Ad {

	void getName();
	static void getStatic() {
		System.out.println("static method");
	}
	default void getDefault() {
		System.out.println("default method");
	}
}
