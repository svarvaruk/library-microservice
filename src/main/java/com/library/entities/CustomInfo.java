package com.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custominfo")
public class CustomInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    
    @Column
	String infoType;
    
    @Column
	String customInfoValue;

	public CustomInfo() {
	}
	
	public CustomInfo(String infoType, String customInfoValue) {
		this.infoType = infoType;
		this.customInfoValue = customInfoValue;
	}
	
	public String getInfoType() {
		return infoType;
	}
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}
	public String getCustomInfoValue() {
		return customInfoValue;
	}
	public void setCustomInfoValue(String customInfoValue) {
		this.customInfoValue = customInfoValue;
	}	
	
}
