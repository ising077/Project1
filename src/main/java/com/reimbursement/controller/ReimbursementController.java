package com.reimbursement.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.reimbursement.models.Reimbursement;
import com.reimbursement.repo.ReimbursementRepository;
import com.reimbursement.services.ReimbursementService;

@RestController
@RequestMapping("/api1")
public class ReimbursementController {

	//CRUD operations
	
	@Autowired
	ReimbursementRepository myReimbursement;
	@Autowired
	ReimbursementService reimbursementService;
	
	@Autowired
	RestTemplate restTemplate;
			
	//Submit a Reimbursement Request
	// Employee enters "Pending" in application status
	@PostMapping("/reimbursementrequest")
	public void createReimbursement(@RequestBody Reimbursement incomingReimbursement) {
		reimbursementService.createReimbursement(incomingReimbursement);
	}
	
// View all Reimbursements
	@GetMapping("/reimbursements")
	public List<Reimbursement> viewAllReimbursements() {
		return myReimbursement.findAll();
	}
	
// View Reimbursement By Id
	@GetMapping("/reimbursement/{id}")
	public Optional<Reimbursement> findReimbursementById(@PathVariable int id) {
		return myReimbursement.findById(id);
	}
	
	
	// View Reimbursement By Id
		@GetMapping("/reimbursement/try/{id}")
		public Optional<Reimbursement> findReimbursementBytryId(@PathVariable int id) {
			if (myReimbursement.findById(id).isPresent())
			{
			return myReimbursement.findById(id);
			}
			else
			{
				return null;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	
	
	
	
	
	
	
// View  All Reimbursements by employeeName
	@GetMapping("/reimbursements/emp/{employeeName}")
	public List<Reimbursement> getAllReimbursementsByemployeeName(@PathVariable String employeeName) {
		List<Reimbursement> reimbursementListEmployee = myReimbursement.getAllReimbursementsByemployeeName(employeeName);
		return reimbursementListEmployee;
	}
	
//View All Reimbursements by managerName
	@GetMapping("/reimbursements/mng/{managerName}")
	public List<Reimbursement> getAllReimbursementsBymanagerName(@PathVariable String managerName) {
		List<Reimbursement> reimbursementListManager = myReimbursement.getAllReimbursementsBymanagerName(managerName);
		return reimbursementListManager;
	}	
	
// Change Application Status
	@PostMapping("/reimbursements/update/status")
	public void updateReimbursement(@RequestBody Reimbursement processedReimbursement) {
		myReimbursement.save(processedReimbursement);
	}
	
//	// View Reimbursement By Id part 2
//		@GetMapping("/reimbursement/try/{id}")
//		public Optional<Reimbursement> findReimbursementById(@PathVariable int id) {
//			return myReimbursement.findById(id);
//		}
	
	
	
	
	
	
//	
////	@RequestMapping(value = "/template/reimbursements")
//	   public String getProductList() {
//	      HttpHeaders headers = new HttpHeaders();
//	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	      HttpEntity <String> entity = new HttpEntity<String>(headers);
//	      Reimbursement response = new Reimbursement();
//	      response= restTemplate.exchange(
//	         "http://localhost:8080/products", HttpMethod.GET, entity, String.class).getBody();
//	
	
	
	
	   }

	
	

	

	 