package com.app.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DuplicateStringInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D://app/optuscopy.json";
StringBuffer bu = new StringBuffer();
		FileInputStream file = null;
		try{
			InputStream in = new FileInputStream(new File(fileName));
			BufferedReader bf = new BufferedReader(new InputStreamReader(in));
			String line="";
			HashMap<String, Integer> hasm = new HashMap<>();
			while((line = bf.readLine()) != null){
				//System.out.println(line);
				bu.append(line);
			}
			for(String s : bu.toString().split("\\s")){
				Integer i = null;
				if(s != "") i = hasm.get(s);
				if(i == null)i=0;
				hasm.put(s.trim(), i+1);
			}
			for(Map.Entry<String, Integer> h : hasm.entrySet()){
				//System.out.println(h.getKey() + " -> "+ h.getValue());
				if(h.getValue() >1)
					System.out.println(h.getKey() + " -> "+ h.getValue());
			}
			
		}catch(Exception e){
			
		}
	}

}
