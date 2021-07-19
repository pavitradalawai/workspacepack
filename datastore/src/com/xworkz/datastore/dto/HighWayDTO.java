package com.xworkz.datastore.dto;

import java.io.Serializable;

import com.xworkz.datastore.dao.constants.HighWayType;

public class HighWayDTO  implements Serializable{
private int id;
private int number;
private HighWayType type;
private String stateName;
private int length;
private boolean condition;
private String contractCompany;

public HighWayDTO() {
}

/**
 * @param id
 * @param number
 * @param type
 * @param stateName
 * @param length
 * @param condition
 * @param contractCompany
 */
public HighWayDTO(int id, int number, HighWayType type, String stateName, int length, boolean condition,
		String contractCompany) {
	super();
	this.id = id;
	this.number = number;
	this.type = type;
	this.stateName = stateName;
	this.length = length;
	this.condition = condition;
	this.contractCompany = contractCompany;
}

@Override
public String toString() {
	return "HighWayDTO [id=" + id + ", number=" + number + ", type=" + type + ", stateName=" + stateName + ", length="
			+ length + ", condition=" + condition + ", contractCompany=" + contractCompany   + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public HighWayType getType() {
	return type;
}

public void setType(HighWayType type) {
	this.type = type;
}

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public boolean isCondition() {
	return condition;
}

public void setCondition(boolean condition) {
	this.condition = condition;
}

public String getContractCompany() {
	return contractCompany;
}

public void setContractCompany(String contractCompany) {
	this.contractCompany = contractCompany;
}
}









