package com.pratice;

public class OverloadingCalculation {
           void sum(int a, int b) {
        	   System.out.println(a + b);
           }
           void sum(int a, int b,int c) {
        	   System.out.println(a + b + c);
           }


public static class Main {
	public static void main(String[] args) {
		OverloadingCalculation c = new OverloadingCalculation();
		c.sum(11, 330);
		c.sum(55, 99);
	}
}
}