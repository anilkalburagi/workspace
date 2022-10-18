package com.qac.corejava.oops.encapsulation;

public class bike {
	private String brandName;
	private int price;
	private byte mlg;
	private String owner;
	private String bikeNONumber;
	
	bike(){
		System.out.println("invoking bike constructor");
	}
	public String getBrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getOwner() {
		return owner;
	
	}
	public void setowner(String owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public byte getMlg() {
		return mlg;
	}
	public void setmlg(byte mlg) {
		this.mlg = mlg;
	}
	public String getBikeNONumber() {
		return bikeNONumber;
	}
	public void setbikeNONumber(String bikeNONumber) {
		this.bikeNONumber = bikeNONumber;
	}
	public void print() {
		System.out.println(brandName +"\n"+ owner +"\n"+ price +"\n"+ mlg +"\n"+ bikeNONumber);
	}
}
