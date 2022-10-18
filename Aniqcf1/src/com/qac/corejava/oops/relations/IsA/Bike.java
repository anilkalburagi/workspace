package com.qac.corejava.oops.relations.HasA.IsA;

public class Bike {
	private String brandName;
	private String color;
	private int cost;
	private String  modelName;
	private byte noOfSeat;
	
	public Bike() {
		System.out.println("invoking car constrcuctor");
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getColor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	

	public String getModelName() {
		return modelName;
	}
	public void setmodelName(String modelName) {
		this.modelName = modelName;
	}
	
	public int getCost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost = cost;
	}
	
	public byte getnoOfSeat() {
		return noOfSeat;
	
	}
	public void setnoOfSeat(byte noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
}
