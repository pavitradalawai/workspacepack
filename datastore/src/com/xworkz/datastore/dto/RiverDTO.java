package com.xworkz.datastore.dto;
import java.io.Serializable;
public class RiverDTO implements Serializable {

private String name;
private String origin;
private double length;
private int noOfStatesInflow;
private boolean hydroPlant;

public RiverDTO() {

}

/**
 * @param name
 * @param origin
 * @param length
 * @param noOfStatesInflow
 * @param hydroPlant
 */
public RiverDTO(String name, String origin, double length, int noOfStatesInflow, boolean hydroPlant) {
	super();
	this.name = name;
	this.origin = origin;
	this.length = length;
	this.noOfStatesInflow = noOfStatesInflow;
	this.hydroPlant = hydroPlant;
}
@Override
public boolean equals (Object obj) {
	if(obj==null)return false;
	if(obj instanceof RiverDTO) {
RiverDTO other=(RiverDTO)obj;
if(this.name.equals(other.getName()))
	 return true;
	}
	return false;
}

@Override
public String toString() {
	return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInflow="
			+ noOfStatesInflow + ", hydroPlant=" + hydroPlant + "]";
		 
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getOrigin() {
	return origin;
}

public void setOrigin(String origin) {
	this.origin = origin;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public int getNoOfStatesInflow() {
	return noOfStatesInflow;
}

public void setNoOfStatesInflow(int noOfStatesInflow) {
	this.noOfStatesInflow = noOfStatesInflow;
}

public boolean isHydroPlant() {
	return hydroPlant;
}

public void setHydroPlant(boolean hydroPlant) {
	this.hydroPlant = hydroPlant;
}

}