package com.lti.gi.repository;

import java.util.List;

import com.lti.gi.entity.Customer;
import com.lti.gi.entity.InsurancePlan;
import com.lti.gi.entity.Vehicle;

public interface BuyInsuranceRepositoryImpl {
	
	boolean isSameVehicleIsInsuredAlready(String registrationNo);
	
	void submissionOfBuyInsuranceData(Vehicle vehicle);
	
	Customer findById(int id);

	List<InsurancePlan> getAllInsuranceData();

}
