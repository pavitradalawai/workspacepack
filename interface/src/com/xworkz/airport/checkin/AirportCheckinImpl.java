package com.xworkz.airport.checkin;

public class AirportCheckinImpl implements AirportCheckin {

@Override
public boolean checkinAtBoardingPoint() {
	System.out.println("ruuning checkinAtBoardingpoint frame");
	return true;
}

@Override
	public boolean collectionBoardingPass(int tickets) {
System.out.println("running collectionBoardingPass frame");
		return true;
	}
}

