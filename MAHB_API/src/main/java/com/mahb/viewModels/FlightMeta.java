package com.mahb.viewModels;

import java.util.List;

public class FlightMeta {

	public List<FlightMetaAirportOperator> AirlineOperators;
	public List<FlightMetaAirportCode> AirportCodes;
	public List<FlightMetaFlight> Flights;

	public List<FlightMetaAirportOperator> getAirlineOperators() {
		return AirlineOperators;
	}
	public void setAirlineOperators(List<FlightMetaAirportOperator> airlineOperators) {
		AirlineOperators = airlineOperators;
	}
	public List<FlightMetaAirportCode> getAirportCodes() {
		return AirportCodes;
	}
	public void setAirportCodes(List<FlightMetaAirportCode> airportCodes) {
		AirportCodes = airportCodes;
	}
	public List<FlightMetaFlight> getFlights() {
		return Flights;
	}
	public void setFlights(List<FlightMetaFlight> flights) {
		Flights = flights;
	}


}
