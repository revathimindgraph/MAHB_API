package com.mahb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mahb.repository.MahbRepository;
import com.mahb.viewModels.SingleToken;



@Service
public class SingleTokenServiceImpl implements SingleTokenService {
	
	@Autowired
	private MahbRepository mahbRepo;
	

	@Override
	public SingleToken save(SingleToken singletoken) {
		// TODO Auto-generated method stub
		return mahbRepo.save(singletoken);
	}

	@Override
	public Optional<SingleToken> getData(String Id) {
		// TODO Auto-generated method stub
		return mahbRepo.findById(Id);
	}

	@Override
	public List<SingleToken> loaddata() {
		// TODO Auto-generated method stub
		return mahbRepo.findAll();
	}

}
