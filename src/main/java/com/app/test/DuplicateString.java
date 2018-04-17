package com.app.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nirmal srinath nirmal";
		 String[] df = str.split("\\s");
		HashMap<String, Integer> hasm = new HashMap<>();
		for(String s : df){
			Integer i = hasm.get(s);
			if(i==null)
				i=0;
			hasm.put(s, i+1);
		}
		for(Map.Entry<String,Integer> h : hasm.entrySet()){
			if(h.getValue()>1)
				System.out.println(h.getKey()+" -> "+h.getValue());
		}
	}

}
