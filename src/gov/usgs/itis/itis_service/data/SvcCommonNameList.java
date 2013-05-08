package gov.usgs.itis.itis_service.data;

import java.util.List;

public class SvcCommonNameList{
   	private List<CommonNames> commonNames;
   	private Integer tsn;

 	public List<CommonNames> getCommonNames(){
		return this.commonNames;
	}
	public void setCommonNames(List<CommonNames> commonNames){
		this.commonNames = commonNames;
	}
 	public Integer getTsn(){
		return this.tsn;
	}
	public void setTsn(Integer tsn){
		this.tsn = tsn;
	}
}