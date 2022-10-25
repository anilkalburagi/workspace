package com.qac.corejava.constructor;

public class Apple extends Fruit {

	String color;
	public Apple() {
		super(100);
		System.out.println("invoking default constructor");
	}
	public Apple(String color) {
		this();
		
		System.out.println("invoking string constructor Apple");
	}
	
	public static void main(String []ak) {
		Apple apple = new Apple();
	}
}
