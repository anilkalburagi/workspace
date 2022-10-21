package com.qac.corejava;

public class mobile {
	private int mobileId;
	private String modelName;
	private int price;
	private String memory;
	private String brandName;
	private byte serialNo;
	private int noOfCamera;

	mobile() {
		System.out.println("invoking properties of mobile");
		
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setmobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setmodelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public String getMemory() {
		return memory;
	}
	public void setmemory(String memory) {
		this.memory = memory;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	public byte getSerialNo() {
		return serialNo;
	}
	public void setserialNo(byte serialNo) {
		this.serialNo = serialNo;
	}
	public int getNoOfCamera() {
		return noOfCamera;
	}
	public void setnoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	public void print() {
		System.out.println(mobileId +"\n"+ modelName+"\n"+ price +"\n"+ memory +"\n"+ brandName +"\n"+ serialNo +"\n"+  noOfCamera );
	}
	
}
