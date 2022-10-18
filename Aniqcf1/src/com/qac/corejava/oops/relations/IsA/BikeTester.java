package com.qac.corejava.oops.relations.HasA.IsA;


import com.qac.corejava.oops.relations.HasA.IsA.Bike;

public class BikeTester {
	public static void main(String []ak) {
		Active bike= new Active(); 
		bike.setbrandName("Active");
		bike.setcolor("Whait");
		bike.setcost(2000);
		bike.setmodelName("Active 5G");
		bike.setnoOfSeat((byte)2);
		bike.setnoOftyer((byte)2);
		bike.setmaxSpeed((byte)120);
		
		
		
		System.out.println(bike.getBrandName());
		System.out.println(bike.getColor());
		System.out.println(bike.getModelName());
		System.out.println(bike.getCost());
		System.out.println(bike.getnoOfSeat());
		System.out.println(bike.getNoOfTyer());
		System.out.println(bike.getMaxSpeed());
		
		System.out.println(bike);
		
		
	}
}
