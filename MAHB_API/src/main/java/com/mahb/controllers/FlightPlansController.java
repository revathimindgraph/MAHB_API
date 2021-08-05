package com.mahb.controllers;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahb.service.FlightPlansService;
import com.mahb.viewModels.FlightPlanViewModel;

@RestController
@RequestMapping("/api/flight-plan")
public class FlightPlansController {

	@Autowired
	private FlightPlansService flightPlanservice;

	@PostMapping
	public int  add(@RequestBody FlightPlanViewModel flightPlanViewModel) {

		flightPlanservice.add(flightPlanViewModel);
	    return Response.SC_OK;
	}

	@PutMapping
	public int Edit(@RequestBody FlightPlanViewModel flightPlanViewModel) {
		flightPlanservice.Edit(flightPlanViewModel);
	    return Response.SC_OK;

	}


	@GetMapping
	public int Get(@RequestParam(value = "skip") int skip,@RequestParam(value = "take") int take) {
		flightPlanservice.get(skip,take);
	    return Response.SC_OK;

	}


	@DeleteMapping
	public int Delete(@RequestParam(value = "afsKey") String afsKey) {
		flightPlanservice.Delete(afsKey);
	    return Response.SC_OK;

	}
}
