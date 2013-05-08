
package gov.usgs.itis.itis_service.data;

public class HierarchyList{
   	private String author;
   	private String parentName;
   	private String parentTsn;
   	private String rankName;
   	private String taxonName;
   	private Integer tsn;

 	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
 	public String getParentName(){
		return this.parentName;
	}
	public void setParentName(String parentName){
		this.parentName = parentName;
	}
 	public String getParentTsn(){
		return this.parentTsn;
	}
	public void setParentTsn(String parentTsn){
		this.parentTsn = parentTsn;
	}
 	public String getRankName(){
		return this.rankName;
	}
	public void setRankName(String rankName){
		this.rankName = rankName;
	}
 	public String getTaxonName(){
		return this.taxonName;
	}
	public void setTaxonName(String taxonName){
		this.taxonName = taxonName;
	}
 	public Integer getTsn(){
		return this.tsn;
	}
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}
