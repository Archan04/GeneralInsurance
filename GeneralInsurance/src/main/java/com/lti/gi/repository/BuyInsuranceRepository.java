package com.lti.gi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.lti.gi.entity.Customer;
import com.lti.gi.entity.InsurancePlan;
import com.lti.gi.entity.Vehicle;

public class BuyInsuranceRepository implements BuyInsuranceRepositoryImpl  {

	@PersistenceContext
	private EntityManager eman;
	

	@Override
	public boolean isSameVehicleIsInsuredAlready(String registrationNo) {
		// TODO Auto-generated method stub
		return (Long)  eman.createQuery("select count(v.id) from Vehicle as v where v.registrationNo= :reNo").setParameter("reNo", registrationNo).getSingleResult()== 1 ? true : false;
	}
	
	@Transactional
	public void submissionOfBuyInsuranceData(Vehicle vehicle) {
		// TODO Auto-generated method stub
		eman.merge(vehicle);
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return eman.find(Customer.class, id);
	}

	@Override
	public List<InsurancePlan> getAllInsuranceData() {
		// TODO Auto-generated method stub
		Query q =eman.createNamedQuery("select plan from InsurancePlan as plan");
		List<InsurancePlan> list = q.getResultList();
		return list;
	}

}
