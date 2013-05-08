
package gov.usgs.itis.itis_service.data;

import java.util.List;

public class SvcHierarchyRecordList{
   	private String author;
   	private List<HierarchyList> hierarchyList;
   	private String rankName;
   	private String sciName;
   	private Integer tsn;

 	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
 	public List<HierarchyList> getHierarchyList(){
		return this.hierarchyList;
	}
	public void setHierarchyList(List<HierarchyList> hierarchyList){
		this.hierarchyList = hierarchyList;
	}
 	public String getRankName(){
		return this.rankName;
	}
	public void setRankName(String rankName){
		this.rankName = rankName;
	}
 	public String getSciName(){
		return this.sciName;
	}
	public void setSciName(String sciName){
		this.sciName = sciName;
	}
 	public Integer getTsn(){
		return this.tsn;
	}
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}
