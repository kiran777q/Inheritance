package com.kiranyanike;

public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;

	}
	
	private void chew() {
		System.out.println("dog.chew() invoked");
	}

	@Override
	public void eat() {
		System.out.println("dog.eat() invoked");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("dog.walk() invoked");
		super.move(10);
	}
	public void run() {
		System.out.println("dog.run() invoked");
		super.move(20);
	}

}
