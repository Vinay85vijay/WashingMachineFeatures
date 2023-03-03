package com.washingmachine.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.washingmachine.FrontEndFeatures;
import com.washingmachine.TopEndFeatures;
import com.washingmachine.repo.FrontEndRepository;
import com.washingmachine.repo.TopEndRepository;
import com.washingmachine.service.CustomerService;
@Service

public class CustomerServiceImplimentation implements CustomerService {
	@Autowired
private static TopEndRepository topRepo;
	@Autowired
private static FrontEndRepository frontRepo;
	
	public List<TopEndFeatures> saveTopEndFeatures(TopEndFeatures topEndFeatures) {
		List<TopEndFeatures> TopEndModel = topRepo.findAll();
		return  TopEndModel;
	}

	
	public List<FrontEndFeatures> saveFrontEndFeatures(FrontEndFeatures frontEndFeatures ) {
		List<FrontEndFeatures> frontEndModel = frontRepo.findAll();
		return frontEndModel;
	}

	
	public TopEndFeatures addTopEndFeatures(TopEndFeatures topEndFeatures) {
		TopEndFeatures addFeatures = topRepo.save(topEndFeatures);
		return addFeatures;
	}

	
	public FrontEndFeatures addFrontEndFeatures(FrontEndFeatures frontEndFeatures) {
		FrontEndFeatures addFeatures = frontRepo.save(frontEndFeatures);
		return addFeatures;
	}


	@Override
	public String deleteTopEndFeatures(@PathVariable Long U_id) {
		topRepo.deleteById(U_id);
		return "Top load features deleted";
		
	}


	@Override
	public String deleteFrontEndFeatures(@PathVariable Long i_id) {
		frontRepo.deleteById(i_id);
		return "front load feature deleted";
	}


	

//	
//	public TopEndFeatures deleteTopEndFeatures(TopEndFeatures topEndFeatures) {
//		 
//		return null;
//	}
//
//	
//	public FrontEndFeatures deleteFrontEndFeatures(FrontEndFeatures frontEndFeatures) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
