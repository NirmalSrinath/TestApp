package com.app.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("nirmal");
		list.add("srinath");
		list.add("pradeep");
		list.add("poovendan");
		list.add("srinath");
		list.add("srinath");
		list.add("srinath");
		list.add("srinath");
		/*System.out.println("insertion Order");
		for(String s : list){
			System.out.println(s);
		}
		System.out.println("reverse Order");
		Collections.reverse(list);
		for(String s : list){
			System.out.println(s);
		}*/
	Set<String> set = new HashSet<>();
	set.addAll(list);
	System.out.println(set);
		System.out.println("ordinery Order");
		for(int i= list.size()-1; i>=0;i--){
			set.add(list.get(i));
			//System.out.println(list.get(i));
		}
		System.out.println(set);
		for(int i= list.size()-1; i>=0;i--){
			for(int j=i+1; j<list.size();j++){
				if(list.get(i) == list.get(j))
					list.remove(j);
			}
		}
		System.out.println(list);
		for(int i= 0; i<list.size();i++){
			for(int j=i+1; j<list.size();j++){
				if(list.get(i) == list.get(j))
					list.remove(j);
			}
		}
		System.out.println(list.get(list.size()-1));
	}

}
