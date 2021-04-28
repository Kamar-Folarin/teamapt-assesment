package com.kamar.transfer_teamapt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kamar.transfer_teamapt.models.Transactions;
import com.kamar.transfer_teamapt.repository.TransactionsRepository;

public class TransactionsService implements Itransactions{

	@Autowired
    private TransactionsRepository transactionsRepository;
	
    @Override
    public List<Transactions> getAllTransactions() {
        // TODO Auto-generated method stub
        return transactionsRepository.findAll();
    }
    
    @Override
    public Optional<Transactions> findByReference(int reference ) {
        // TODO Auto-generated method stub
        return transactionsRepository.findByReference(reference);
    }
    
    @Override
    public Transactions save(Transactions reference) {
        // TODO Auto-generated method stub
        return transactionsRepository.save(reference);
    }
    
}