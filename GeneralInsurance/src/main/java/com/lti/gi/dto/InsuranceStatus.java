package com.lti.gi.dto;

import com.lti.gi.entity.MotorInsurance;
import com.lti.gi.entity.Payment;

public class InsuranceStatus extends Status{

	private MotorInsurance motorInsurance;
	private Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public MotorInsurance getMotorInsurance() {
		return motorInsurance;
	}

	public void setMotorInsurance(MotorInsurance motorInsurance) {
		this.motorInsurance = motorInsurance;
	}

	
}
