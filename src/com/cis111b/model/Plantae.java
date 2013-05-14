package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Plantae extends TaxonomicUnit {
	
	/** Constructor for Plant, throws exception if TSN number is not a plant
	 * @param taxonomicSerialNumber
	 */
	public Plantae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.kingdom != null) {
			if (!this.kingdom.equals("Plantae")) {
				throw new RuntimeException("TSN Is Not A Plant");
			}
		}
	}
}
