package com.pbendal.practice.billing;

import com.pbendal.practice.billing.pizza.BasePizza;
import com.pbendal.practice.billing.pizza.VeggiePizza;
import com.pbendal.practice.billing.topping.CheeseTopping;
import com.pbendal.practice.billing.topping.MushroomTopping;

public class Main {

	public static void main(String[] args) {
		
		BasePizza pizza1=new VeggiePizza();
		System.out.println(pizza1.getCost());
		System.out.println(pizza1.getDescripion());
		pizza1=new CheeseTopping(pizza1);
		System.out.println(pizza1.getCost());
		System.out.println(pizza1.getDescripion());
		pizza1=new CheeseTopping(pizza1);
		System.out.println(pizza1.getCost());
		System.out.println(pizza1.getDescripion());
		pizza1=new MushroomTopping(pizza1);
		System.out.println(pizza1.getCost());
		System.out.println(pizza1.getDescripion());
		
		

	}

}
