package com.qac.corejava.oops.relations.HasA;

public class Car {
	private String brandName;
	private String modelName;
	private int cost;
	private Engine engine;
	
	public static void main(String[] ak) {
		Engine engine= new Engine();
		engine.setbrandName("BMW");
		engine.setnoOfStrokes((byte)8);
		engine.setcapacity((short)3300);
	}
	
	public Car() {
	Engine engine = new Engine();
	engine.setbrandName("BMW");
	engine.setcapacity((short)3222);
	engine.setnoOfStrokes((byte)8);
	}
	public String getBrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	
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
	public void setcost(int  cost) {
		this.cost = cost;
	
	}

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	
}
