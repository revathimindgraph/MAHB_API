package com.mahb.viewModels;

import java.sql.Timestamp;

import com.mahb.constants.Constant;

public class FlightStatusFp {
	

	
	public String Terminal ;

    public String Leg ;

    public String Category ;

    public Constant.Destination Origin;

    public Constant.Destination Destination ;

    public String FlightType ;

    public String Status ;

    public Timestamp FlightTime ;

    public String FlyingTime ;

    public String FlightNumber;

    public Constant.Belt Belt ;

    public Constant.Checkin CheckIn ;

    public Constant.Gate Gate ;

    public String[] CodeShareFlights ;

	public String getTerminal() {
		return Terminal;
	}

	public void setTerminal(String terminal) {
		Terminal = terminal;
	}

	public String getLeg() {
		return Leg;
	}

	public void setLeg(String leg) {
		Leg = leg;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Constant.Destination getOrigin() {
		return Origin;
	}

	public void setOrigin(Constant.Destination origin) {
		Origin = origin;
	}

	public Constant.Destination getDestination() {
		return Destination;
	}

	public void setDestination(Constant.Destination destination) {
		Destination = destination;
	}

	public String getFlightType() {
		return FlightType;
	}

	public void setFlightType(String flightType) {
		FlightType = flightType;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Timestamp getFlightTime() {
		return FlightTime;
	}

	public void setFlightTime(Timestamp flightTime) {
		FlightTime = flightTime;
	}

	public String getFlyingTime() {
		return FlyingTime;
	}

	public void setFlyingTime(String flyingTime) {
		FlyingTime = flyingTime;
	}

	public String getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}

	public Constant.Belt getBelt() {
		return Belt;
	}

	public void setBelt(Constant.Belt belt) {
		Belt = belt;
	}

	public Constant.Checkin getCheckIn() {
		return CheckIn;
	}

	public void setCheckIn(Constant.Checkin checkIn) {
		CheckIn = checkIn;
	}

	public Constant.Gate getGate() {
		return Gate;
	}

	public void setGate(Constant.Gate gate) {
		Gate = gate;
	}

	public String[] getCodeShareFlights() {
		return CodeShareFlights;
	}

	public void setCodeShareFlights(String[] codeShareFlights) {
		CodeShareFlights = codeShareFlights;
	}
    
    
}
