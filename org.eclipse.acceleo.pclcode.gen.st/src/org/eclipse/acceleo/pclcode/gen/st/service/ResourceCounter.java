package org.eclipse.acceleo.pclcode.gen.st.service;

public class ResourceCounter {
	
	private Integer counter;
	private static ResourceCounter instance;
	
	public static ResourceCounter getInstance() {
		if (instance == null) {
			synchronized (ResourceCounter.class) {
				if (instance == null) {
					instance = new ResourceCounter();
				}
			}
		}
		return instance;
	}
	
	public String initResourceCounter() {
		instance = getInstance();
		counter = 0;
		return "";
	}
	
	public String addUpCounter() {
		counter += 1;
		return "";
	}
	
	public Integer getCounter() {
		return counter;
	}
	
	public Integer getUnitCounter() {
		if(counter < 10)
			return counter * 10;
		return counter;
	}
	
}