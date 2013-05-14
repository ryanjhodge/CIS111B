
package gov.usgs.itis.itis_service.data;

/** Represents the Common Name Class used by ITIS.gov
 * @author Ryan
 *
 */
public class CommonNames{
   	private String jsonClass;
   	private String commonName;
   	private String language;
   	private Integer tsn;

 	/**
 	 * @return the json Class (i.e. the ITIS.gov class name)
 	 */
 	public String getJsonClass(){
		return this.jsonClass;
	}
	/**
	 * @param jsonClass the ITIS.gov class to set
	 */
	public void setClass(String jsonClass){
		this.jsonClass = jsonClass;
	}
 	/**
 	 * @return the common Name
 	 */
 	public String getCommonName(){
		return this.commonName;
	}
	/**
	 * @param commonName the common name to set
	 */
	public void setCommonName(String commonName){
		this.commonName = commonName;
	}
 	/**
 	 * @return the language of the common name
 	 */
 	public String getLanguage(){
		return this.language;
	}
	/**
	 * @param language the language of the common name to set
	 */
	public void setLanguage(String language){
		this.language = language;
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
