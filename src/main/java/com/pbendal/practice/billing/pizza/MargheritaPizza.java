package com.pbendal.practice.billing.pizza;

import java.util.HashMap;
import java.util.Map;

public class MargheritaPizza implements BasePizza {
	
	

	@Override
	public int getCost() {
		
		return 450;
	}

	@Override
	public Map<String, Integer> getDescripion() {
		Map<String,Integer> desc=new HashMap<>(); 
		desc.put("MargheritaPizza", 1);
		return desc;
	}

}
