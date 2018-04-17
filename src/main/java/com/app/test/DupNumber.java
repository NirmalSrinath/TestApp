package com.app.test;

import java.util.HashMap;
import java.util.Map;

public class DupNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={2,1,1,3,2,5,2,1,5,6,1};
		Map<Integer, Integer> jk = new HashMap<>();
		for(Integer f : a){
			//System.out.println(f);
			Integer sd = jk.get(f);
			if(sd == null)sd=0;
			jk.put(f, sd+1);
		}
		System.out.println(jk.size()-1);
		System.out.println(jk.get(3));
		for(Map.Entry<Integer, Integer> dc : jk.entrySet()){
			System.out.print(dc.getKey() +"->" +dc.getValue()+" ");
			
			//if(dc.getValue() >=2)System.out.println(dc.getKey() +"->" +dc.getValue());
		}
	}

}
