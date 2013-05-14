package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Felidae extends Animalia {

	/** Constructor for feline, throws exception if TSN number is not a feline
	 * @param taxonomicSerialNumber
	 */
	public Felidae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.family != null) {
			if (!this.family.equals("Felidae")) {
				throw new RuntimeException("TSN Is Not A Cat");
			}
		}
	}

}
