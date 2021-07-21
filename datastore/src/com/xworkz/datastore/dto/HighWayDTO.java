package com.xworkz.datastore.dto;

import java.io.Serializable;

import com.xworkz.datastore.dao.HighwayType;
import com.xworkz.datastore.dao.constants.*;
public class HighWayDTO  implements Serializable{
private int id;
private int number;
private HighwayType type;
private String stateName;
private double length;
private boolean condition;
private String contractCompany;

public HighWayDTO() {
}

/**
 * @param string
 * @param number
 * @param nationalhighway
 * @param stateName
 * @param d
 * @param condition
 * @param contractCompany
 */
public HighWayDTO(String string, int number, HighwayType nationalhighway, String stateName, double d, boolean condition,
		String contractCompany) {
	super();
	int intiger = 0;
	this.id = intiger;
	this.number = number;
	this.type = nationalhighway;
	this.stateName = stateName;
	this.length = d;
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

public HighwayType getType() {
	return type;
}

public void setType(HighwayType type) {
	this.type = type;
}

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

public int getLength() {
	return (int) length;
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









