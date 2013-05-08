package com.cis111b.model;

public class Animalia extends TaxonomicUnit {
	
	public Animalia(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.kingdom != null) {
			if (!this.kingdom.equals("Animalia")) {
				throw new IllegalArgumentException("TSN Is Not An Animal");
			}
		}
	}
}
