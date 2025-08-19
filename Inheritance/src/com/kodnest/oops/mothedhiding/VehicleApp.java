package com.kodnest.oops.mothedhiding;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ref = new Car();
		ref.start();
		ref.drive();//Car.drive();
		ref.stop();
		
		Vechicle ref2=new Car();
		ref2.start();
		ref2.drive();//Vechicle.drive();
		ref2.stop();
		
		

	}

}
