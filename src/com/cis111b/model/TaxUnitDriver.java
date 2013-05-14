package com.cis111b.model;

import com.cis111b.model.TaxonomicUnit;

public class TaxUnitDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaxonomicUnit test = new Animalia(4456);
		//TaxonomicUnit plant = new Plantae(552780);
		//Animalia cat = new Animalia(552780);
		System.out.println(test.getFamily());

	}

}
