package com.qac.corejava.oops.relations;

import com.qac.corejava.oops.relations.HasA.Car;
import com.qac.corejava.oops.relations.HasA.Engine;
public class TestCar {

	public static void main(String []ak) {
		Car bmw310 = new Car();
		bmw310.setbrandName("BMW");
		bmw310.setmodelName("rr310");
		bmw310.setcost(30000);
		
		Engine engine = new Engine();
		engine.setbrandName("rr310");
		engine.setcapacity((short)312);
		engine.setnoOfStrokes((byte)8);
		
		bmw310.setEngine(engine);
		
		System.out.println(bmw310.getBrandName());
		System.out.println(bmw310.getModelName());
		System.out.println(bmw310.getCost());
		
		Engine bmw310Eng = bmw310.getEngine();
		System.out.println(bmw310Eng.getBrandName());
		System.out.println(bmw310Eng.getCapacity());
		System.out.println(bmw310Eng.getNoOfStrokes());
		
		
		
	}
}
