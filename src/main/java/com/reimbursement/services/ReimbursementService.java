package com.reimbursement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.reimbursement.models.Reimbursement;
import com.reimbursement.repo.ReimbursementRepository;



@Service
public class ReimbursementService {
	
	@Autowired
	ReimbursementRepository myReimbursement;
	
	public void createReimbursement(Reimbursement incomingReimbursement) {
		myReimbursement.save(incomingReimbursement);
	}

	public void deleteReimbursement(Reimbursement incomingReimbursement){
		myReimbursement.delete(incomingReimbursement);
	}

	public Reimbursement getReimbursement(int id)
	{
		Reimbursement test = myReimbursement.findById(id).get();
		return test;
	}
	
	

	

	
	
	
	
}
