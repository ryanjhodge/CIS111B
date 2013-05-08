package com.cis111b.model;

public class Tracheophyta extends Plantae {
	
	public Tracheophyta(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.division != null) {
			if (!this.division.equals("Tracheophyta")) {
				throw new IllegalArgumentException("TSN Is Not A Vascular Plant");
			}
		}
	}
}
