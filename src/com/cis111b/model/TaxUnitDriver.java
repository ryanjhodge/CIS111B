package com.cis111b.model;

import com.cis111b.model.TaxonomicUnit;

public class TaxUnitDriver {

	/** Tests com.cis111b.model classes
	 * @param args
	 */
	public static void main(String[] args) {
		TaxonomicUnit tiger = new Animalia(183805);
		Plantae maple = new Tracheophyta(28728);
		System.out.println("Felidae:" + tiger.getFamily());
		System.out.println("Tracheophyta:" + maple.getDivision());
		
		//should fail trying to instantiate tiger as a plant:
		@SuppressWarnings("unused")
		Plantae tigerFail = new Plantae(183805);

	}

}
