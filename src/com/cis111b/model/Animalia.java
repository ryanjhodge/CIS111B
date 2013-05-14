package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Animalia extends TaxonomicUnit {
	
	/** Constructor for Animal, throws exception if TSN number is not an animal
	 * @param taxonomicSerialNumber
	 */
	public Animalia(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.kingdom != null) {
			if (!this.kingdom.equals("Animalia")) {
				throw new IllegalArgumentException("TSN Is Not An Animal");
			}
		}
	}
}
