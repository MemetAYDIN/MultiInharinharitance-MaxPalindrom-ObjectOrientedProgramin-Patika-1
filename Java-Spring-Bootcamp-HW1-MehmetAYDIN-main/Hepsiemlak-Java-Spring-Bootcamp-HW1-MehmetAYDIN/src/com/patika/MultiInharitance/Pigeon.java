package com.patika.MultiInharitance;

public class Pigeon extends Bird {

	public Pigeon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void fly()
	{
		System.out.println("Ku�  "+name+"  u�uyor....");
	}
	
	public void land()
	{
		System.out.println("Ku�  "+name+"  konuyor...");
	}
}
