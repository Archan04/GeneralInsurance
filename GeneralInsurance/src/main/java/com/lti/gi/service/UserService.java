package com.lti.gi.service;

import java.util.List;

import com.lti.gi.dto.RenewDetails;
import com.lti.gi.dto.UserInsuranceStatus;
import com.lti.gi.dto.ValidateClaim;
import com.lti.gi.entity.InsuranceClaim;
import com.lti.gi.entity.MotorInsurance;
import com.lti.gi.entity.Payment;
import com.lti.gi.entity.User;
import com.lti.gi.entity.VehicleModels;

public interface UserService {
	public User register(User user);

	public User login(String email, String password);
	
	public InsuranceClaim claim(int policyNumber, String email, //String password, 
			String claimReason, double claimAmount);
	
    public List<VehicleModels> fetchVehicles();
	
    public MotorInsurance getRenewDetails(RenewDetails renewDetails);

    public Payment storeInsuranceDetails(MotorInsurance motorInsurance);
    
    public int savePaymentdetails(Payment payment);

	public int resetPassword(User user);
    
    public List<MotorInsurance> getUserInsuranceDetails(int userId);
    
    public List<InsuranceClaim> getPolicyClaimDetails(int policyNumber);

    public List<InsuranceClaim> getAllClaims();
    
    public void validateClaimUpdate(ValidateClaim validateClaim);
    
    public void denyClaimUpdate(ValidateClaim validateClaim);
    
    public void updateUserDetails(User user);
    
    public UserInsuranceStatus getVehiclesByUserId(int userId);

    public User getUserDetails(int userId);

}
