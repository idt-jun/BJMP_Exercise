package com.mstar.training.beans;

public enum Region {
	NCR("National Capital Region"),
	CAR("Cordillera Administrative Region"),
	REGION_1("Ilocos Region"),
	REGION_2("Cagayan Valley");
	
	//continue the list of all the regions
	
	private String regionName;
	
	private Region(String regionName){
		this.regionName = regionName;
	}

	public String getRegionName() {
		return regionName;
	}

}
