package com.mahb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.mahb.viewModels.SingleToken;

public interface SingleTokenService {
	
	public SingleToken save(SingleToken singletoken);
	
	public Optional<SingleToken> getData(String Id);

	public List<SingleToken> loaddata();

}
