package com.qac.corejava;

import com.qac.corejava.mobile;

public class Testmobile {
 
	public static void main (String []Ak) {
		
		
		mobile Mobile = new mobile();
		Mobile.setbrandName("xiomi");
		Mobile.setmodelName("MI y2");
		Mobile.setmobileId(12);
		Mobile.setprice(10000);
		Mobile.setmemory("32Gb");
		Mobile.setserialNo((byte)123456);
		Mobile.setnoOfCamera((int)2);
		Mobile.print();
	}
	
}
