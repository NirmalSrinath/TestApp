package com.app.test;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] i = {1,2,3,4,4,5,6,1};
 for(int j= i.length -1; j>=0; j--){
	 int h=1;
	 for(int k = j+1; k<i.length;k++){
		 if(i[j] == i[k]){
			 h+=1;
			 System.out.println(i[j]+" ->"+h);
		 }
			 
	 }
 }
	}

}
