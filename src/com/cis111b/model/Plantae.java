package com.cis111b.model;

public class Plantae extends TaxonomicUnit {
	
	public Plantae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.kingdom != null) {
			if (!this.kingdom.equals("Plantae")) {
				throw new RuntimeException("TSN Is Not A Plant");
			}
		}
	}
}
