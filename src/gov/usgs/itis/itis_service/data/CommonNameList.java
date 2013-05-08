
package gov.usgs.itis.itis_service.data;

import java.util.List;

public class CommonNameList{
   	private String class;
   	private List commonNames;
   	private String tsn;

 	public String getClass(){
		return this.class;
	}
	public void setClass(String class){
		this.class = class;
	}
 	public List getCommonNames(){
		return this.commonNames;
	}
	public void setCommonNames(List commonNames){
		this.commonNames = commonNames;
	}
 	public String getTsn(){
		return this.tsn;
	}
	public void setTsn(String tsn){
		this.tsn = tsn;
	}
}
