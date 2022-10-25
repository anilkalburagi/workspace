package com.qac.corejava.constructor;

public class Fruit {

	String name;
	int price;
	public Fruit() {
		
		System.out.println("invoking default conscructor");
	}
	public Fruit(String name) {
		this(100);
		System.out.println("invoking string constrcutor");
	}
	public Fruit(int price) {
		this();
		System.out.println("invoking int constructor");
	}
	public static void main(String []ak) {
		Fruit f = new Fruit("Apple");
	}
}
