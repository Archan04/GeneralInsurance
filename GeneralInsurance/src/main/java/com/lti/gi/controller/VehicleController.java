package com.lti.gi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gi.dto.VehicleStatus;
import com.lti.gi.dto.Status.StatusType;
import com.lti.gi.entity.Vehicle;
import com.lti.gi.exception.VehicleServiceException;
import com.lti.gi.service.VehicleService;

@RestController
@CrossOrigin
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping("/register-vehicle")
	public @ResponseBody VehicleStatus register(@RequestBody Vehicle vehicle) {
		try {
			 //System.out.println(vehicle.getUser().getUserId());
			//System.out.println(vehicle.getRegNo()+" "+vehicle.getManufacturer()+" "+vehicle.getEngineNumber());
			vehicle = vehicleService.register(vehicle);
			//System.out.println("called!");
			vehicle.setInsurances(null);
			//vehicle.getUser().setInsurances(null);
			VehicleStatus status = new VehicleStatus();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Registration Successfull");
			status.setVehicle(vehicle);
			return status;
		}
		catch(VehicleServiceException e) {
			System.out.println("exception");
			e.printStackTrace();
			VehicleStatus status = new VehicleStatus();
			status.setStatus(StatusType.FAILED);
			status.setMessage("Registration failed");
			return status;
		}
	}

}

