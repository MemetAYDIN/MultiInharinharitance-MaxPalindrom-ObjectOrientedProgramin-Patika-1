package com.patika.MultiInharitance;

public class Test {
	public static void main(String[] args) {
		Pigeon pigeon=new Pigeon("Taklac�");
		pigeon.fly();
		pigeon.land();
		
		
		Bird bird=new Pigeon("Pa�al�");
		bird.fly();
		bird.land();
		
		
		Flyable flyable=new  Pigeon("Postac�");
		flyable.fly();
		flyable.land();
		
		Bat bat=new Bat("Batman");
		bat.fly();
		bat.land();
		
		Flyable flyable2=new Bat("Vampir");
		flyable2.fly();
		flyable2.land();
		
		
		Mammal mammal=new Bat("Robin");// Memeli u�amaz yani. Memelilerin u�abilme �zelli�i olma��� i�in �al��maz
		//mammal.fly();
		//mammal.land();
		
		makeFly(pigeon);
		makeFly(bird);
		makeFly(flyable);
		makeFly(flyable2);
		
		
		
	}
	
	
	private static void makeFly(Flyable flyable)
	{
		System.out.println();
		System.out.println("U�!");
		flyable.fly();
		System.out.println("KON!");
		flyable.land();
		
	}
	
	
}
