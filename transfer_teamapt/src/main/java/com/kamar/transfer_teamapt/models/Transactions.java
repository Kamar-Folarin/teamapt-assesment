package com.kamar.transfer_teamapt.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@Getter
//@Setter
@Accessors(chain = true)
@NoArgsConstructor
@Entity
@Table(name = "transactions")
@EntityListeners(AuditingEntityListener.class)

public class Transactions implements Serializable {
    //private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reference;
    
    @Column(nullable = false, updatable = false)
    private double amount ;
    
    @Column(nullable = false, updatable = false)
    private String account_nr;
    
    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createdDate;
    
    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime updatedDate;
    
    @Autowired
	public int getReference() {
		return reference;
	}
    
    @Autowired
	public void setReference(int reference) {
		this.reference = reference;
	}
    
    @Autowired
	public double getAmount() {
		return amount;
	}
    
    @Autowired
	public void setAmount(double amount) {
		this.amount = amount;
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
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
    
    @Autowired
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
    
    @Autowired
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
    
    @Autowired
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	
}
