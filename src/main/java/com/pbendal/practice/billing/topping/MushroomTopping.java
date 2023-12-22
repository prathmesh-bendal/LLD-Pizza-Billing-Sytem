package com.pbendal.practice.billing.topping;

import java.util.Map;

import com.pbendal.practice.billing.pizza.BasePizza;

public class MushroomTopping implements  PizzaTopping{
	
	BasePizza pizza;

	public MushroomTopping(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		return this.pizza.getCost()+50;
	}

	@Override
	public Map<String, Integer> getDescripion() {
		Map<String, Integer> desc=this.pizza.getDescripion();
		desc.put("MushroomTopping", desc.getOrDefault("MushroomTopping", 0)+1);
		return desc;
	}
	

}
