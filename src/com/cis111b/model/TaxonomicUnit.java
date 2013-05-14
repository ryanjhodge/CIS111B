package com.cis111b.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import gov.usgs.itis.itis_service.data.*;

import com.google.gson.Gson;

/**
 * @author Ryan
 *
 */
public class TaxonomicUnit {
	
	protected String species;
	protected String genus;
	protected String family;
	protected String division;
	protected String kingdom;
	protected String commonName;
	protected Integer taxonomicSerialNumber;
	
	/** Constructor for Taxonomic Unit
	 * @param taxonomicSerialNumber
	 */
	public TaxonomicUnit(Integer taxonomicSerialNumber) {
		this.taxonomicSerialNumber = taxonomicSerialNumber;
		
		try {
			URL url = new URL("http://www.itis.gov/ITISWebService/jsonservice/getFullHierarchyFromTSN?tsn=" + taxonomicSerialNumber);
			InputStream urlInputStream = url.openConnection().getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(urlInputStream, "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line;
			
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			Gson gson = new Gson();
			SvcHierarchyRecordList hierarchy = new SvcHierarchyRecordList();
			
			hierarchy = gson.fromJson(sb.toString(), SvcHierarchyRecordList.class);
			for (HierarchyList taxa: hierarchy.getHierarchyList()) {
				//System.out.println(taxa.getRankName() + taxa.getTaxonName());
				if(taxa.getRankName().equals("Genus")) {
					this.genus = taxa.getTaxonName();
				}
				else if(taxa.getRankName().equals("Species")) {
					this.species = taxa.getTaxonName().toString();
				}
				else if(taxa.getRankName().equals("Family")) {
					this.family = taxa.getTaxonName().toString();
				}
				else if(taxa.getRankName().equals("Division")) {
					this.division = taxa.getTaxonName().toString();
				}
				else if(taxa.getRankName().equals("Kingdom")) {
					this.kingdom = taxa.getTaxonName().toString();
				}
			}
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @return the genus
	 */
	public String getGenus() {
		return genus;
	}
	/**
	 * @param genus the genus to set
	 */
	protected void setGenus(String genus) {
		this.genus = genus;
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * @param species the species to set
	 */
	protected void setSpecies(String species) {
		this.species = species;
	}
	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}
	/**
	 * @param family the family to set
	 */
	protected void setFamily(String family) {
		this.family = family;
	}
	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	protected void setDivision(String division) {
		this.division = division;
	}
	/**
	 * @return the kingdom
	 */
	public String getKingdom() {
		return kingdom;
	}
	/**
	 * @param kingdom the kingdom to set
	 */
	protected void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}
	/**
	 * @return the taxonomicSerialNumber
	 */
	protected Integer getTaxonomicSerialNumber() {
		return taxonomicSerialNumber;
	}
	/**
	 * @param taxonomicSerialNumber the taxonomicSerialNumber to set
	 */
	protected void setTaxonomicSerialNumber(Integer taxonomicSerialNumber) {
		this.taxonomicSerialNumber = taxonomicSerialNumber;
	}
	/**
	 * @return the commonName
	 */
	public String getCommonName() {
		return commonName;
	}
	/**
	 * @param commonName the commonName to set
	 */
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	
}
