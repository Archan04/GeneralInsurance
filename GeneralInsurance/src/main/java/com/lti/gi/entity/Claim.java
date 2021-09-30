package com.lti.gi.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLAIM_HISTORY")
public class Claim {
	
	@Id
	@SequenceGenerator(name = "claim_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue
	private int id;
	
	@Column(name = "claim_date")
	private LocalDate date;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "contact_no")
	private long contactNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	
}
