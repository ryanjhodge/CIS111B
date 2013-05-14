
package gov.usgs.itis.itis_service.data;

import java.util.List;

/** Represents the full hierarchy of a Taxonomic Serial Number (i.e. all ranks such
 * as Kingdom, Phylum, Class, Genus, Species etc.)
 * @author Ryan
 *
 */
public class SvcHierarchyRecordList{
   	private String author;
   	private List<HierarchyList> hierarchyList;
   	private String rankName;
   	private String sciName;
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
 	 * @return the hierarchy list
 	 */
 	public List<HierarchyList> getHierarchyList(){
		return this.hierarchyList;
	}
	/**
	 * @param hierarchyList the hierarchy list to set
	 */
	public void setHierarchyList(List<HierarchyList> hierarchyList){
		this.hierarchyList = hierarchyList;
	}
 	/**
 	 * @return the rank name
 	 */
 	public String getRankName(){
		return this.rankName;
	}
	/**
	 * @param rankName the rank name to set
	 */
	public void setRankName(String rankName){
		this.rankName = rankName;
	}
 	/**
 	 * @return the scientific name
 	 */
 	public String getSciName(){
		return this.sciName;
	}
	/**
	 * @param sciName the scientific name to set
	 */
	public void setSciName(String sciName){
		this.sciName = sciName;
	}
 	/**
 	 * @return the taxonomic Serial Number
 	 */
 	public Integer getTsn(){
		return this.tsn;
	}
	/**
	 * @param tsn the Taxonomic Serial Number to set
	 */
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}
