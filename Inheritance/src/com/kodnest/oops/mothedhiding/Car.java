package com.kodnest.oops.mothedhiding;

public class Car extends Vechicle {
	String name="Lambo";
	@Override
	void start()
	{
		System.out.println(name +" is starting..");
	}
	static void drive()
	{
		System.out.println("Lambo is driven..");
	}
  @Override
  void stop()
  {
	  System.out.println(name + " is stoping.......");
  }
}

