package com.qac.corejava.oops.encapsulation;

import com.qac.corejava.oops.encapsulation.Laptop;

public class Testlaptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setbranadNameAndModelName("Dell inspiron");
		System.out.println(laptop.getBranadNameAndModelName());
		
		laptop.setprice(66500);
		laptop.setram((byte)8);
		laptop.setos("windos");
		laptop.setprocessor("i511gen");   
		laptop.print();
	}
}
