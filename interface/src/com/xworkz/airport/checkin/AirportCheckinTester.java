package com.xworkz.airport.checkin;


public class AirportCheckinTester {

	public static void main(String[] args) {
	
AirportCheckin airportCheckin=new AirportCheckinImpl();
System.out.println(AirportCheckin.LUGGAGE_WEIGHT);
airportCheckin.checkinAtBoardingPoint();
airportCheckin.collectionBoardingPass(2);
	}
	
	

}
