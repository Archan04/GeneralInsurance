package com.lti.gi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gi.entity.Customer;
import com.lti.gi.entity.InsurancePlan;
import com.lti.gi.entity.Vehicle;
import com.lti.gi.repository.BuyInsuranceRepository;

@Service
public class BuyInsuranceServiceImpl implements BuyInsuranceService{

	@Autowired
	private BuyInsuranceRepository buyInsuranceRepo;
	
	@Override
	public void submissionOfBuyInsuranceDetails(Vehicle vehicle) {
		
		if(!buyInsuranceRepo.isSameVehicleIsInsuredAlready(vehicle.getRegistrationNo()))
		{
			buyInsuranceRepo.submissionOfBuyInsuranceData(vehicle);
		}
		
	}

	@Override
	public Customer findById(int id) {
		return buyInsuranceRepo.findById(id);
	}

	@Override
	public List<InsurancePlan> getAllInsurancePlan() {
		List<InsurancePlan> list=buyInsuranceRepo.getAllInsuranceData();
		return list;
	}

}
