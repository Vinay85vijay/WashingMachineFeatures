package com.washingmachine.service;

import java.util.List;

import com.washingmachine.FrontEndFeatures;
import com.washingmachine.TopEndFeatures;

public interface CustomerService {
	List<TopEndFeatures> saveTopEndFeatures(TopEndFeatures topEndFeatures);
       List<FrontEndFeatures> saveFrontEndFeatures(FrontEndFeatures frontEndFeatures);
       TopEndFeatures addTopEndFeatures(TopEndFeatures topEndFeatures);
       FrontEndFeatures addFrontEndFeatures(FrontEndFeatures frontEndFeatures);
      String deleteTopEndFeatures(Long U_id);
     String deleteFrontEndFeatures(Long i_id);
    //   List<TopEndFeatures> findAll();
	
}
