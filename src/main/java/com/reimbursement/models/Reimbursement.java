package com.reimbursement.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Reimbursement {

	@Id //to treat this state as the primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //primary key value will be auto generated!
	private int id;
	
	@Column(name = "employeeName", nullable = false)
	private String employeeName;
	
	@Column(name = "managerName", nullable = false)
	private String managerName;
	
	@Column(name = "Department", nullable = false)
	private String department;
	
	@Column(name = "amount", nullable = false)
	private double amount;
	
	@Column(name = "reimbursementType", nullable = false)
	private String reimbursementType;
	
	@Column(name = "applicationStatus", nullable = false)
	private String applicationStatus;
	

	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(String employeeName, String managerName, String department, double amount,
			String reimbursementType, String applicationStatus) {
		super();
		this.employeeName = employeeName;
		this.managerName = managerName;
		this.department = department;
		this.amount = amount;
		this.reimbursementType = reimbursementType;
		this.applicationStatus= applicationStatus;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "Reimbursement [employeeName=" + employeeName + ", managerName=" + managerName + ", department="
				+ department + ", amount=" + amount + ", reimbursementType=" + reimbursementType
				+ ", applicationStatus=" + applicationStatus + "]";
	}
}	