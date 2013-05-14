package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Canidae extends Animalia {
	
	/** Constructor for canine, throws exception if TSN number is not a canine
	 * @param taxonomicSerialNumber
	 */
	public Canidae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.family != null) {
			if (!this.family.equals("Canidae")) {
				throw new RuntimeException("TSN Is Not A Canine");
			}
		}
	}
}
