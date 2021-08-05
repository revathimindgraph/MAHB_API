package com.mahb.controllers;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahb.service.FlightService;


@RestController
@RequestMapping("/api/flight")
public class FlightsController {

	@Autowired
	private FlightService flightService;


	@GetMapping("/refresh-cache")
	public int ClearCache() {
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight-arrivals")
	public int GetFlightArrivals(@RequestParam(value = "terminal") String terminal,@RequestParam(value = "skip") int skip,@RequestParam(value = "take") int take,@RequestParam(value = "fromArrivals") int fromArrivals,@RequestParam(value = "toArrivals") int toArrivals,@RequestParam(value = "fromDepartures") int fromDepartures ,@RequestParam(value = "toDepartures") int toDepartures ) {
		flightService.GetFlightArrivals(terminal,skip,take,fromArrivals,toArrivals,fromDepartures,toDepartures);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight")
	public int getFlight(@RequestParam(value = "filghtNumber") String filghtNumber,@RequestParam(value = "afsKey") float afsKey) {
		flightService.getFlight(filghtNumber,afsKey);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight-arrivals-cache")
	public int GetFlightArrivalsCache(@RequestParam(value = "terminal") String terminal,@RequestParam(value = "skip") int skip,@RequestParam(value = "take") int take) {
		flightService.GetFlightArrivalsCache(terminal,skip,take);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight-departures")
	public int GetFlightDepartures(@RequestParam(value = "terminal") String terminal,@RequestParam(value = "skip") int skip ,@RequestParam(value = "take") int take,@RequestParam(value = "fromArrivals") int fromArrivals,@RequestParam(value = "toArrivals") int toArrivals ,@RequestParam(value = "fromDepartures") int fromDepartures ,@RequestParam(value = "toDepartures") int toDepartures) {
		flightService.GetFlightDepartures( terminal, skip ,  take, fromArrivals,  toArrivals ,  fromDepartures, toDepartures);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight-departures-cache")
	public int GetFlightDeparturesCache(@RequestParam(value = "terminal") String terminal,@RequestParam(value = "skip") int skip ,@RequestParam(value = "take") int take)
	{
		flightService.GetFlightDeparturesCache( terminal, skip, take);
	    return Response.SC_OK;

	}

	@GetMapping("/error")
	public void ThrowError() {
		flightService.ThrowError();
	
	}

	@GetMapping("/get-flights")
	public int 	GetFlights(@RequestParam(value = "code") String code,@RequestParam(value = "flightNumber") String flightNumber,@RequestParam(value = "afsKey") float afsKey,@RequestParam(value = "aircraftOperatorCode") String aircraftOperatorCode,@RequestParam(value = "originCityCode") String originCityCode,@RequestParam(value = "destinationCityCode") String destinationCityCode,@RequestParam(value = "skip") int skip ,@RequestParam(value = "take") int take ,@RequestParam(value = "longerWindow") boolean longerWindow ,@RequestParam(value = "fromArrivals") int fromArrivals ,@RequestParam(value = "toArrivals") int toArrivals ,@RequestParam(value = "fromDepartures") int fromDepartures,@RequestParam(value = "toDepartures") int toDepartures ) {
		flightService.GetFlights( code,  flightNumber,  afsKey,  aircraftOperatorCode,  originCityCode,  destinationCityCode,  skip ,  take ,  longerWindow ,  fromArrivals ,  toArrivals ,  fromDepartures,  toDepartures);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flights-cache")
	public int GetFlightsCache(@RequestParam(value = "code") String code,@RequestParam(value = "flightNumber") String flightNumber,@RequestParam(value = "afsKey") float afsKey,@RequestParam(value = "aircraftOperatorCode") String aircraftOperatorCode,@RequestParam(value = "originCityCode") String originCityCode,@RequestParam(value = "destinationCityCode") String destinationCityCode,@RequestParam(value = "skip") int skip ,@RequestParam(value = "take") int take) {
		flightService.GetFlightsCache( code,  flightNumber,  afsKey,  aircraftOperatorCode,  originCityCode, destinationCityCode, skip , take);
	    return Response.SC_OK;

	}

	@GetMapping("/get-flight-meta")
	public int GetFlightMeta(@RequestParam(value = "checksum") String checksum) {
		flightService.GetFlightMeta(checksum);
	    return Response.SC_OK;

	}
}
















