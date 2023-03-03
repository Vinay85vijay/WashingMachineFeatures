package com.washingmachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.washingmachine.FrontEndFeatures;
import com.washingmachine.TopEndFeatures;
import com.washingmachine.service.CustomerService;
@RestController
public class MachineController {
//	@Autowired
//	private  FrontEndRepository fRipo;
//	@Autowired
//	private  TopEndRepository tRipo;
	
	@Autowired
	 private static CustomerService customerService;
	
	@GetMapping("/home")
	public String home() {
	//	 List<FrontEndFeatures> saveTopEndFeatures = customerService.findAll();
		return "home";
	}
	
	@GetMapping("/TopLoad")	
	public List<TopEndFeatures> topEndF(TopEndFeatures topEndFeatures) {
		 List<TopEndFeatures> saveTopEndFeatures = customerService.saveTopEndFeatures(topEndFeatures);
		 return saveTopEndFeatures;
	}
	@GetMapping("/FrontLoad")
	public List<FrontEndFeatures> frontEndF( FrontEndFeatures frontEndFeatures) {
		 List<FrontEndFeatures> saveFront= customerService.saveFrontEndFeatures(frontEndFeatures) ;
		 return saveFront;
		 
	
	}
	@PostMapping("/TopLoad")
	public TopEndFeatures addTopEndF( @RequestBody TopEndFeatures topEndFeatures) {
		 TopEndFeatures addTop = customerService.addTopEndFeatures(topEndFeatures);
		 return addTop;
	}
	@PostMapping("/FrontLoad")
	public FrontEndFeatures addFrontEndF( @RequestBody FrontEndFeatures frontEndFeatures) {
		FrontEndFeatures addFront = customerService.addFrontEndFeatures(frontEndFeatures);
		return addFront;
	}
//
//	@DeleteMapping("/top/{U_id}")
//	public String deleteTop(@PathVariable Long U_id ) {
//		 customerService.deleteTopEndFeatures(U_id);
//		 return "deleted";
//		
//	}
//	@DeleteMapping("/front/{i_id}")
//	public String deleteFront(@PathVariable Long i_id ) {
//		 customerService.deleteFrontEndFeatures(i_id);
//		 return "deleted";
//		
//	}

}