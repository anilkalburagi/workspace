package com.qac.corejava.objectClass;

public class objectclassmethod {
	
	private String name = "Ani";
	private String msg = "hi ani good evening";
	
	public static void main(String []ak) {
		
		objectclassmethod methods = new objectclassmethod();
		objectclassmethod methods1 = new objectclassmethod();
		objectclassmethod methods2 = new objectclassmethod();
		
		//return the class object
		Class classobj = methods.getClass();
		
		//get name
		System.out.println(classobj.getName());
		
		//get simple name
		System.out.println(classobj.getSimpleName());
		
		System.out.println(methods.hashCode());
		System.out.println(methods1.hashCode()); 
		System.out.println(methods2.hashCode());
		
		System.out.println(methods.toString());
		System.out.println(methods.equals(methods1));
		System.out.println(methods1.equals(methods1));
		
		
	}
	public String toString() {
		return this.getClass().getSimpleName() + this.hashCode()+"[Name : "+name + "And msg: "+ msg+"]";
	}
}
