package com.lti.gi.service;

import java.util.List;

import com.lti.gi.entity.Estimate;
import com.lti.gi.entity.Vehicle;
import com.lti.gi.entity.VehicleModels;

public interface VehicleService {

	public List<Estimate> getPremiumPlans(Vehicle vehicle);

	public Vehicle register(Vehicle vehicle);
	
	public VehicleModels addNewVehicle(VehicleModels vehicleModel);

	public List<VehicleModels> listAvailableVehicle();
}
