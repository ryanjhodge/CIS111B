package com.cis111b.model;

public class Felidae extends Animalia {

	public Felidae(Integer taxonomicSerialNumber) {
		super(taxonomicSerialNumber);
		if (this.family != null) {
			if (!this.family.equals("Felidae")) {
				throw new RuntimeException("TSN Is Not A Cat");
			}
		}
	}

}
