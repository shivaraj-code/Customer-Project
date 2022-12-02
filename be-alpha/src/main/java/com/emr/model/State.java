package com.emr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@Entity
@ToString
public class State {

	@Id	
	private Integer state_Id;
	private String  state_Name;
	private String state_Code;
	public Integer getState_Id() {
		return state_Id;
	}
	public void setState_Id(Integer state_Id) {
		this.state_Id = state_Id;
	}
	public String getState_Name() {
		return state_Name;
	}
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}
	public String getState_Code() {
		return state_Code;
	}
	public void setState_Code(String state_Code) {
		this.state_Code = state_Code;
	}
	
	}
	
	
	

