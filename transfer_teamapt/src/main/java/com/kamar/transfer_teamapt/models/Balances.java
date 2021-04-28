package com.kamar.transfer_teamapt.models;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.AccessType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@Getter
//@Setter
//@Accessors(chain = true)// 
// @NoArgsConstructor
@Entity
@Table(name = "balances")
//@EntityListeners(AuditingEntityListener.class)
//@Access(value=AccessType.FIELD)
public class Balances implements Serializable {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, updatable = false)
	private double balance;

	@Column(nullable = false, updatable = false)
	private String account_nr;
	

	@Autowired
	public double getBalance() {
		return balance;
	}

	@Autowired
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Autowired
	public String getAccount_nr() {
		return account_nr;
	}

	@Autowired
	public void setAccount_nr(String account_nr) {
		this.account_nr = account_nr;
	}
	
	@Autowired
	public int getId() {
		return id;
	}
	
	@Autowired
	public void setId(int id) {
		this.id = id;
	}

}
