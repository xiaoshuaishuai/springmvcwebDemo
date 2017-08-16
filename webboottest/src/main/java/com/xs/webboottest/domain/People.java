package com.xs.webboottest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class People {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String namep;
	private String decp;
	
	public People() {
		super();
	}
	public People(String namep, String decp) {
		this.namep=namep;
		this.decp=decp;
	}
	//------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamep() {
		return namep;
	}
	public void setNamep(String namep) {
		this.namep = namep;
	}
	public String getDecp() {
		return decp;
	}
	public void setDecp(String decp) {
		this.decp = decp;
	}
	
	
	
}
