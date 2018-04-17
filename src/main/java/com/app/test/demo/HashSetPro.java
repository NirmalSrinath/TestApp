package com.app.test.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> aSet = new HashSet<>();
		aSet.add("nirmal");
		aSet.add("Srinath");
		aSet.add("nirmal");
		aSet.add("pradeep");
		aSet.add("poovendhan");
		
		aSet.forEach(s->{
			System.out.println(s);
		});
	}

}
