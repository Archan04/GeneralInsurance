package com.lti.gi.service;

import java.util.List;

import com.lti.gi.entity.Customer;
import com.lti.gi.entity.InsurancePlan;
import com.lti.gi.entity.Vehicle;

public interface BuyInsuranceService {
	
	void submissionOfBuyInsuranceDetails(Vehicle vehicle);
	Customer findById(int id);
	List<InsurancePlan> getAllInsurancePlan();
}
