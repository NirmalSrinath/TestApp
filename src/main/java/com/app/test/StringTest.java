package com.app.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test123 k = new Test123();
		k.callBack();
	}

}

class Test123{
	char a;
	void callBack(){
		//String a;
		char e = 'w';
		System.out.println(a+"  Second: "+e);
		String fileName = "D://app/fileReader.txt";
		try {
			List<String> list = Files.lines(Paths.get(fileName)).collect(Collectors.toMap(Function.identity().));
			System.out.println(list);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
