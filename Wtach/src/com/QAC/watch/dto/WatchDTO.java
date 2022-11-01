package com.QAC.watch.dto;

import com.QAC.watch.dto.smartWatchDTO;

public class WatchDTO {

	private String brandName;
	private String color;
	private int price;
	
	public WatchDTO() {
		System.out.println("invoking watchdto constrcutor");
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
	public int getPrice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}

}
