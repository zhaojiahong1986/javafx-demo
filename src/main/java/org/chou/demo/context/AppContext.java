package org.chou.demo.context;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AppContext {

	private static AppContext appContext = new AppContext();
	
	private Map<String, Serializable> models = new HashMap<>();
	
	private AppContext() {
		
	}
	
	public static AppContext getAppContext() {
		return appContext;
	}
	
	public void put(String key, Serializable value) {
		this.models.put(key, value);
	}
	
	public Serializable get(String key) {
		return this.models.get(key);
	}
	
	public Serializable remove(String key) {
		return this.models.remove(key);
	}
}
