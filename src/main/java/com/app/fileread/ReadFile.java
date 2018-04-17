package com.app.fileread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.getTheFile();

	}

}

class A{
	public void getTheFile(){
		try{
			StringBuffer out = new StringBuffer();
			String fileName = "D://app/fileReader.txt";
			InputStream in = new FileInputStream(fileName);
			BufferedReader bu = new BufferedReader(new InputStreamReader(in));
			Map<String,Object> mapList =new HashMap<>();
			String line="";
			while((line = bu.readLine()) !=null){
				out.append(line);
				String ddd = Character.toUpperCase(line.charAt(0))+line.substring(1);
				//System.out.println(ddd);
				String[] arr = line.split("\\s");
				/*String sd = null;
				for(String word : arr){
					String hj = Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
					sd = (sd != null)? (sd+=hj) : hj;
				}*/
				List list = new ArrayList();
				List key = (List) mapList.get(arr[1]);
				if(key == null){
    					list.add(arr[0]);
					mapList.put(arr[1], list);
				}else{
					key.add(arr[0]);
					mapList.put(arr[1], key);
				}
				
				//System.out.println(key);
				//System.out.println(list);
			}
			String[] userList = {"ceo","man","lead","emp"};
			for (String string : userList) {
				List<String> key = (List<String>) mapList.get(string);
				key.forEach(s->{
					System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1)+" "+Character.toUpperCase(string.charAt(0))+string.substring(1)+" ");
				});
			}
bu.close();
		}catch(Exception e){
System.out.println(e);
		}
	}
}