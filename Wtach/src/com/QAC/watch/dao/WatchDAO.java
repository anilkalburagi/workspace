package com.QAC.watch.dao;

import com.QAC.watch.dto.smartWatchDTO;

public class WatchDAO {

	private smartWatchDTO []SmartWatch = new smartWatchDTO[10];

	public void save(smartWatchDTO watch) {
		SmartWatch[0]=watch;
	}
	public String deletByBrandName(String brandName) {
		
		for (int i = 0; i<SmartWatch.length; i++) {
			if(SmartWatch[i] != null && SmartWatch[i].getBrandName().equals(brandName)) {
				SmartWatch[i] = null;
				return "Deleted " +brandName;
			}
		}
		return "brandName "+brandName +"Not present";
	}
}
