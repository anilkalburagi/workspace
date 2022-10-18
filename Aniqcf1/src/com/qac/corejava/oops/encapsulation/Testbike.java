package com.qac.corejava.oops.encapsulation;

import com.qac.corejava.oops.encapsulation.bike;

public class Testbike {

	public static void main (String []ak) {
		
		bike Bike = new bike();
		Bike.setbrandName("hero");
		Bike.setowner("Ani");
		Bike.setprice(10000);
		Bike.setmlg((byte)90);
		Bike.setbikeNONumber("ka32");
		Bike.print();
	}
}
