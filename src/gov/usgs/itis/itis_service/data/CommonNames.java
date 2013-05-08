
package gov.usgs.itis.itis_service.data;

public class CommonNames{
   	private String jsonClass;
   	private String commonName;
   	private String language;
   	private Integer tsn;

 	public String getJsonClass(){
		return this.jsonClass;
	}
	public void setClass(String jsonClass){
		this.jsonClass = jsonClass;
	}
 	public String getCommonName(){
		return this.commonName;
	}
	public void setCommonName(String commonName){
		this.commonName = commonName;
	}
 	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}
 	public Integer getTsn(){
		return this.tsn;
	}
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}
