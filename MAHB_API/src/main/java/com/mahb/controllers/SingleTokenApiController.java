package com.mahb.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mahb.service.SingleTokenService;
import com.mahb.validation.SingleTokenValidator;
import com.mahb.viewModels.SingleToken;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("mahb")
public class SingleTokenApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SingleTokenApiController.class);

	@Autowired
	SingleTokenValidator singletokenvalidator;
	@Autowired
	SingleTokenService singletokenservice;

	@GetMapping("/index")
	public ResponseEntity<String> index(HttpServletRequest request) {
		LOGGER.info("SingleTokenController - index() :: Start");
		String message = "MAHB API: ";
		LOGGER.info("SingleTokenController - index() :: End");
		return ResponseEntity.ok().body(message);
	}

	// saving app to sts data
	@RequestMapping(value = "/Singletoken", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveSingletokenData(@RequestBody SingleToken singleTokenData) throws Exception {
		LOGGER.info("SingleTokenController - saveSingletokenData :: Start ");
		String validationMessage = null;
		if (singleTokenData != null) {
			boolean flag = singletokenvalidator.actionValidation(singleTokenData);
			if (flag) {
				singletokenservice.save(singleTokenData);
				return ResponseEntity.ok().body("Data saved successfull");
			} else {
				return ResponseEntity.badRequest().body("Failed to validate the action");
			}
		} else {
			return ResponseEntity.badRequest().body("Data null and not unsuccessfull");
		}

	}

	
	
	@RequestMapping(value = "singletoken/{id}", method = {RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getSingleTokenData(@PathVariable String id) throws Exception {
        LOGGER.info("SingleTokenController - getApplicationStatus() :: Start");
        SingleToken datares = new SingleToken();
        Optional<SingleToken> singletoken  = null;
        if(id != null) {
            LOGGER.info("Id is not null : " + id);
            singletoken = singletokenservice.getData(id);
            datares.setId(singletoken.get().getId());
            datares.setAction(singletoken.get().getAction());
            datares.setJsonResult(singletoken.get().getJsonResult());
            return ResponseEntity.ok().body("Retrieved data with"+datares.getId() +datares.getAction()+datares.getJsonResult());
        } else {
            LOGGER.info("Id is null");
            return ResponseEntity.badRequest().body("Data null and not unsuccessfull");
        }
    }
	
	
	
	

	// todisplay complete data
	@RequestMapping(value = "singletoken/getdata", method = {
			RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SingleToken> getSingleTokenCompleteData() throws Exception {
		LOGGER.info("SingleTokenController - getSingleTokenCompleteData() :: Start");
		return singletokenservice.loaddata();

	}

}
