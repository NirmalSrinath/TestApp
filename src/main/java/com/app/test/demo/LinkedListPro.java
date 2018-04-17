package com.app.test.demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> aList = new LinkedList<>();
		aList.add("nirmal");
		aList.add("Srinath");
		aList.add("nirmal");
		aList.add("pradeep");
		aList.add("poovendhan");
		
		aList.forEach(s->{
			System.out.println(s);
		});
	}

}
