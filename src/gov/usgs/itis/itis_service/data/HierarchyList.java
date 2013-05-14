
package gov.usgs.itis.itis_service.data;

/** Represents the HierarchyList class used by ITIS.gov
 * @author Ryan
 *
 */
public class HierarchyList{
   	private String author;
   	private String parentName;
   	private String parentTsn;
   	private String rankName;
   	private String taxonName;
   	private Integer tsn;

 	/**
 	 * @return the author
 	 */
 	public String getAuthor(){
		return this.author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author){
		this.author = author;
	}
 	/**
 	 * @return the parent taxon name
 	 */
 	public String getParentName(){
		return this.parentName;
	}
	/**
	 * @param parentName parent taxon name to set
	 */
	public void setParentName(String parentName){
		this.parentName = parentName;
	}
 	/**
 	 * @return the parent taxon
 	 */
 	public String getParentTsn(){
		return this.parentTsn;
	}
	/**
	 * @param parentTsn the parent taxon to set
	 */
	public void setParentTsn(String parentTsn){
		this.parentTsn = parentTsn;
	}
 	/**
 	 * @return the taxonomic rank name
 	 */
 	public String getRankName(){
		return this.rankName;
	}
	/**
	 * @param rankName the taxonomic rank to set
	 */
	public void setRankName(String rankName){
		this.rankName = rankName;
	}
 	/**
 	 * @return the taxon name
 	 */
 	public String getTaxonName(){
		return this.taxonName;
	}
	/**
	 * @param taxonName the taxon name to set
	 */
	public void setTaxonName(String taxonName){
		this.taxonName = taxonName;
	}
 	/**
 	 * @return the Taxonomic Serial Number
 	 */
 	public Integer getTsn(){
		return this.tsn;
	}
	/**
	 * @param tsn the Taxonoimc Serial Number to set
	 */
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}
