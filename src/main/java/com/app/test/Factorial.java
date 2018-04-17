package com.app.test;

import java.util.Scanner;

public class Factorial
{ 
	static int fir=0,next=1;
    public static void main(String[] args) 
    {
        int n, mul;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        Factorial obj = new Factorial();
        mul = obj.factw(n);
        System.out.println("Factorial of "+n+" :"+mul);
        System.out.print("Fibonaci  : " +fir +" "+next);
        obj.Fact(n);
        //System.out.println("Factorial of "+n+" :"+incrr);
    }
    int factw(int x)
    {
        if(x > 1)
        {
        	int vbv = x * factw(x - 1);
            return(vbv);
        }
        return 1;
    }
   void Fact(int x)
    {
        if(x>0){
        	int a = fir + next;
        	fir = next;
        	next = a;
        	System.out.print(" "+a);
        	Fact(x-1);
        }
    }
}