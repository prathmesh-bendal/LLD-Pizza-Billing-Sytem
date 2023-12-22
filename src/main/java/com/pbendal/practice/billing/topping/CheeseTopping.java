package com.pbendal.practice.billing.topping;

import java.util.Map;

import com.pbendal.practice.billing.pizza.BasePizza;

public class CheeseTopping implements PizzaTopping {
	
	BasePizza pizza;

	public CheeseTopping(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		
		return this.pizza.getCost()+75;
	}

	@Override
	public Map<String, Integer> getDescripion() {
		Map<String, Integer> desc=this.pizza.getDescripion();
		desc.put("CheeseTopping", desc.getOrDefault("CheeseTopping", 0)+1);
		return desc;
	}
	
	

}
