package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Bryophyta extends Plantae {
	
	/** Constructor for non-vascular plants, throws exception if TSN is not 
	 * a non-vascular plant
	 * @param taxonomicSerialNumber
	 */
	public Bryophyta(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.division != null) {
			if (!this.division.equals("Bryophyta")) {
				throw new IllegalArgumentException("TSN Is Not An Non-vascular Plant");
			}
		}
	}
}
