package com.patika.MultiInharitance;

public class Pigeon extends Bird {

	public Pigeon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void fly()
	{
		System.out.println("Kuþ  "+name+"  uçuyor....");
	}
	
	public void land()
	{
		System.out.println("Kuþ  "+name+"  konuyor...");
	}
}
