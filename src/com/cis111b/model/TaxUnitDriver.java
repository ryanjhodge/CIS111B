package com.cis111b.model;

import com.cis111b.model.TaxonomicUnit;

public class TaxUnitDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaxonomicUnit test = new Animalia(4456);
		//TaxonomicUnit plant = new Plant(552780);
		//Animal cat = new Animal(552780);
		System.out.println(test.getFamily());

	}

}
