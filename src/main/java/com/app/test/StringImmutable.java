package com.app.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String d = "nirmal";
		System.out.println(d.hashCode());
		String d1 = "nirmal";
		System.out.println(d1.hashCode());*/
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		 
		for(String a: set)
			System.out.println(a.hashCode());
		System.out.println("---------------");
		HashMap<String,String> hj = new HashMap<>();
		Map<String,String> hj1 = new ConcurrentHashMap<>();
		hj.put("a","sadasd");
		hj.put("b","sadasd");
		hj.put("c","sadasd");
		hj1.putAll(hj);
		System.out.println(" -- "+hj.hashCode());
		hj1.remove("b");
		for(Map.Entry<String, String> a: hj.entrySet()){
			System.out.println(a.getKey() + "  "+ a.getValue() + "  "+a.hashCode()+" -- "+hj.hashCode()+"");
			//hj1.remove("c");
		}
		UUID uuid = UUID.randomUUID();
		System.out.println("=====****"+uuid);
		hj.put("c","aaaaaaaaaaaaaaaaaaa");
		for(Map.Entry<String, String> a: hj.entrySet()){
			System.out.println(a.getKey() + "  "+ a.getValue() + "  "+a.hashCode()+" -- "+hj.hashCode());
			//hj1.remove("c");
		}
		

	}

}
