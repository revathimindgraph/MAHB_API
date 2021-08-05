package com.mahb.validation;

import org.springframework.stereotype.Service;

import com.mahb.viewModels.SingleToken;

@Service
public class SingleTokenValidator {
	
	
	
	public static boolean actionValidation(SingleToken singletoken) {
        if(singletoken.getAction() != null && !singletoken.getAction().isEmpty()) {
        	if(singletoken.getAction().equals("request") || singletoken.getAction().equals("response"))
        	  return true;
        }
        return false;
    }
	
	

}
