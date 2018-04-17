package com.app.test;

public class DuplicateNumberArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		int temp = 0;
		int s[] = new int[a.length];
		for(int i=0; i<a.length;i++){
			for(int j =i+1; j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		/*for(int q : a ){
			System.out.print(q);
		}*/
		for(int i = a.length -1; i>=0;i--){
			System.out.print(a[i]);
		}
		//System.out.println(a[a.length-1] + "    "+a.length);
	}

}
