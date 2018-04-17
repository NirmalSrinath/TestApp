package com.app.test.demo;

public class Soart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a[]={1,2,3,1,4};

   for(int i =0; i<a.length;i++){
	   for(int j=i+1;j<a.length;j++){
		   if(a[i]>a[j]){
			   int tr = a[i];
			   a[i]= a[j];
			   a[j]=tr;
		   }
	   }
   }
  // for(int i :a){ System.out.println(i);}
   int d = a.length/2;
   ////System.out.println(9/2);
  // System.out.println(a.length%2);
   
   int a1 = 1234567;  
   int a2 = a1;
   int flag=0;

   while(a2>0)
   {
	  // System.out.println(a1/=10);
	  // System.out.println(a2%10);
       a2/=10;               //Moves to the left by one digit
       if(a2==0)             //If there are odd no. of digits
       {
           flag=1;
           break;
       }
       a2/=10;               //Moves to the left by one digit
       a1/=10;               //Moves to the left by one digit
   } System.out.println(a1);
   
   System.out.print(flag!=1?"No Mid Exists":a1%10);
	}

}
