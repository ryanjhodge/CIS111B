package com.cis111b.model;

public class Canidae extends Animalia {
	public Canidae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.family != null) {
			if (!this.family.equals("Canidae")) {
				throw new RuntimeException("TSN Is Not A Canine");
			}
		}
	}
}
