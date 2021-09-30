package com.lti.gi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gi.dto.StatusDto;
import com.lti.gi.dto.StatusDto.StatusType;
import com.lti.gi.dto.VehicleDto;
import com.lti.gi.entity.Customer;
import com.lti.gi.entity.InsurancePlan;
import com.lti.gi.entity.Vehicle;
import com.lti.gi.service.BuyInsuranceService;

@RestController
@CrossOrigin
public class BuyInsuranceController {
	
	@Autowired
	private BuyInsuranceService service;
	
	@GetMapping(path="/getAllInsurance", produces="application/json")
	public List<InsurancePlan> getAllInsurancePlans()
	{
		return service.getAllInsurancePlan();
	}
	
	@PostMapping(path="/buyInsurance", consumes = "application/json", produces = "application/json")
	public StatusDto submissionDetail(VehicleDto vehicleDto)
	{
	try {
		Vehicle vehicle = new Vehicle();
		//BeanUtils.copyProperties(vehicleDto, vehicle);
		
		vehicle.setChassisNo(vehicleDto.getChassisNo());
		vehicle.setDrivingLicense(vehicleDto.getDrivingLicense());
		vehicle.setEngineType(vehicleDto.getEngineType());
		vehicle.setEngineNo(vehicleDto.getEngineNo());
		vehicle.setManufacturer(vehicleDto.getManufacture());
		vehicle.setModel(vehicleDto.getModel());
		vehicle.setType(vehicleDto.getType());
		vehicle.setPurchaseDate(vehicleDto.getPurchaseDate());
		vehicle.setLastRenewDate(vehicleDto.getLastRenewDate());
		vehicle.setRegistrationNo(vehicleDto.getRegistrationNo());
		
		
		Customer customer = service.findById(vehicleDto.getCustomerId());
		
		vehicle.setCustomer(customer);
		
		service.submissionOfBuyInsuranceDetails(vehicle);
		
		StatusDto status = new StatusDto();
		status.setStatus(StatusType.SUCCESS);
		status.setMessage("Details Are Submitted for Verification.");
		return status;
		
	} catch (Exception e) {
		
		StatusDto status = new StatusDto();
		status.setStatus(StatusType.FAILURE);
		status.setMessage(e.getMessage());
		return status;
	}
	}
}
