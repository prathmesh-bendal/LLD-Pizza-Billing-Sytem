package com.pbendal.practice.billing.pizza;

import java.util.HashMap;
import java.util.Map;

public class VeggiePizza implements BasePizza {
	


	@Override
	public int getCost() {
		
		return 200;
	}

	@Override
	public Map<String, Integer> getDescripion() {
		Map<String,Integer> desc=new HashMap<>(); 
		desc.put("VeggiePizaa", 1);
		return desc;
	}

}
