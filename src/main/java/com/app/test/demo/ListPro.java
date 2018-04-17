package com.app.test.demo;

import java.util.ArrayList;
import java.util.List;

public class ListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> aList = new ArrayList<>();
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
