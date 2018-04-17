package com.app.onlinetest;

public class ShortCkt {
	static int i;
	
    public static void main(String args[]) {
        while (i < 0) {
        i--;
        }
	  System.out.println(i);
	  kk k = new kk();
	  k.m();
	  k.n();
   }
    
}
class kk{
	private String sd;
	void m(){
    	System.out.println(sd);
    }
    void n(){
    	System.out.println(sd);
    }
}