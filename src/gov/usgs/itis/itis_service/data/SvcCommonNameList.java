package gov.usgs.itis.itis_service.data;

import java.util.List;

/** Represents the Common Name List class used by ITIS.gov
 * @author Ryan
 *
 */
public class SvcCommonNameList{
   	private List<CommonNames> commonNames;
   	private Integer tsn;

 	/**
 	 * @return the list of common names
 	 */
 	public List<CommonNames> getCommonNames(){
		return this.commonNames;
	}
	/**
	 * @param commonNames the common names to set
	 */
	public void setCommonNames(List<CommonNames> commonNames){
		this.commonNames = commonNames;
	}
 	/**
 	 * @return the Taxonomic Serial Number
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