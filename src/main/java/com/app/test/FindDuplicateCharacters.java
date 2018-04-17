package com.app.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FindDuplicateCharacters{
	
	public static void main (String[] args)
	   {StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	   StringTokenizer st1 = new StringTokenizer("my name is khan");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());
	         System.out.println(st1.countTokens()); 
	     }  }
	}
	
