package com.cis111b.model;

public class Bryophyta extends Plantae {
	
	public Bryophyta(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.division != null) {
			if (!this.division.equals("Bryophyta")) {
				throw new IllegalArgumentException("TSN Is Not An Non-vascular Plant");
			}
		}
	}
}
