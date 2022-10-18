package com.qac.corejava.oops.relations.HasA;

public class Engine {
	
	private String brandName;
	private byte noOfStrokes;
	private short capacity;
	
	
	public Engine() {
		System.out.println("Invoking car consrcuter");
	}
	public String getBrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	public byte getNoOfStrokes() {
		return noOfStrokes;
	}
	public void setnoOfStrokes(byte noOfStrokes) {
		this.noOfStrokes = noOfStrokes;
	}
	public short getCapacity() {
		return capacity;
	}
	public void setcapacity(short noOfStrokes) {
		this.capacity = noOfStrokes;
	}
	
	
	
}
