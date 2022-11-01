package com.QAC.watch.dto;


public class smartWatchDTO extends WatchDTO {

	private String display;
	private String features[];

	public smartWatchDTO() {
		System.out.println("invoking watchh constrcutor");
	}
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String[] getFeatures() {
		return features;
	}
	public void setFeatures(String[] features) {
		this.features = features;
	}

	public void print() {
		System.out.println(getBrandName() +"\n"+ getColor() +"\n"+ getPrice() +"\n"+  display +"\n"+ features); 
		
	}
	
}
