package com.reimbursement.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.reimbursement.models.Reimbursement;

@Repository
public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {

	List<Reimbursement> getAllReimbursementsByemployeeName(String employeeName);

	List<Reimbursement> getAllReimbursementsBymanagerName(String managerName);
	
	
}