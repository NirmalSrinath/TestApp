package com.app.test;

import java.util.Scanner;

public class Exercise58 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		System.out.println(line + "-------------");
		String upper_case_line = ""; 
		@SuppressWarnings("resource")
		Scanner lineScan = new Scanner(line); 
		System.out.println(lineScan + "-------------");
		while(lineScan.hasNext()) {

			String word = lineScan.next(); 
			System.out.println(word + "-------------");
			System.out.println(word.charAt(0) + "-------------");
			System.out.println(word.substring(1) + "-------------");
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
		}
		System.out.println(upper_case_line.trim()); 
	}
}
