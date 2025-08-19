package com.kodnest.expection.intro;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            System.out.println("Connection Estasbled.");
            try {
            System.out.println("Enter 2 numbers are");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=a/b;
            System.out.println("Result: "+c);
            }
            catch(Exception e) {
            	System.out.println("ArithmeticExpection : / by Zero at Line 15");
            }
            System.out.println("Connection Terminated");
	}

}
