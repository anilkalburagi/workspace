package com.qac.colleaction;

import java.util.ArrayList;

public class NameusingArraylist extends Object{ 
	

	public static void main(String []ak) {
		
		NameusingArraylist nameusingArraylist = new NameusingArraylist();
		
		ArrayList detailes = new ArrayList();
		detailes.add("Anil");
		detailes.add(1999);
		detailes.add(5.9f);
		
		System.out.println(detailes.get(0));
		System.out.println(detailes);
		detailes.remove(1);
		System.out.println(detailes);
		
		System.out.println(detailes.size());
		
		detailes.clear();
		
		System.out.println(detailes);
		
		
		System.out.println("========="+nameusingArraylist);
	}
}
