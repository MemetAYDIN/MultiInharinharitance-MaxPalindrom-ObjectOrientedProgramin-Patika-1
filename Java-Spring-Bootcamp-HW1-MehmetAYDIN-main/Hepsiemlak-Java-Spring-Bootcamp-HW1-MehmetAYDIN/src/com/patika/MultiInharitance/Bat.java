package com.patika.MultiInharitance;

public class Bat extends Mammal implements Flyable{//Yarasa uçabilen bir memelidir

	public Bat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void fly()
	{
		System.out.println("Yarasa  "+name+"  uçuyor....");
	}
	
	public void land()
	{
		System.out.println("Yarasa  "+name+"  konuyor...");
	}
	

}