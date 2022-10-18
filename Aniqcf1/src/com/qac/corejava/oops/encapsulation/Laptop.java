package com.qac.corejava.oops.encapsulation;

public class Laptop {
	private String branadNameAndModelName;
	private int price;
	private byte ram;
	private String os;
	private String processor;

	Laptop(){
		System.out.println("Invoking laptop constructor");
	}
	public String getBranadNameAndModelName() {
		return branadNameAndModelName;
		
	}
	public void setbranadNameAndModelName(String branadNameAndModelName) {
		this.branadNameAndModelName = branadNameAndModelName;
	}
	public int getPrice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public byte getRam() {
		return ram;
	}
	public void setram(byte ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setos(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setprocessor(String processor) {
		this.processor = processor;
	}
	public void print() {
		System.out.println(branadNameAndModelName + "\t" + price + "\t" + ram + "\t" + os +"\t" + processor );
	}
}
