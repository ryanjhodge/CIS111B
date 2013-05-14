package com.cis111b.model;

/**
 * @author Ryan
 *
 */
public class Tracheophyta extends Plantae {
	
	/** Constructor for Vascular Plant, throws exception if TSN number is 
	 * not a vascular plant
	 * @param taxonomicSerialNumber
	 */
	public Tracheophyta(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.division != null) {
			if (!this.division.equals("Tracheophyta")) {
				throw new IllegalArgumentException("TSN Is Not A Vascular Plant");
			}
		}
	}
}
