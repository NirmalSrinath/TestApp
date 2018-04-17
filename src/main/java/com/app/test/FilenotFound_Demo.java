package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFound_Demo {

   public static void main(String args[]) throws FileNotFoundException {		
      File file1 = new File("E://file.txt");
    
    	  try {
    		   FileInputStream file = new FileInputStream(file1);
    		   byte x = (byte) file.read();
    		} catch (IOException i) {
    		   i.printStackTrace();
    		  // return -1;
    		}
	}
}