package com.QAC.watch;

import com.QAC.watch.dao.WatchDAO;
import com.QAC.watch.dto.smartWatchDTO;

public class Test {

	public static void main(String []ak) {
		
		String []features = {"calling","sports","time"};
		
		smartWatchDTO watch = new smartWatchDTO();
		watch.setbrandName("BOAT");
		watch.setcolor("red");
		watch.setprice(1000);
		watch.setDisplay("LED");
		watch.setFeatures(features);
		watch.print();
		
		smartWatchDTO watch1 = new smartWatchDTO();
		watch1.setbrandName("xiomi");
		watch1.setcolor("black");
		watch1.setprice(2000);
		watch1.setDisplay("LED");
		watch1.setFeatures(features);
		watch1.print();
		
		WatchDAO dao = new  WatchDAO();
		dao.save(watch);
		
		String respones = dao.deletByBrandName("BOAT");
		System.out.println(respones);
		//System.out.println(watch1);
	}
		
	}


