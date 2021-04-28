package com.kamar.transfer_teamapt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kamar.transfer_teamapt.models.Balances;
import com.kamar.transfer_teamapt.repository.BalancesRepository;

public class BalancesService implements Ibalances {
	
	@Autowired
    private BalancesRepository balancesRepository;
	
//    @Override
//   public List<Balances> getAllBalances() {
//        // TODO Auto-generated method stub
//        return balancesRepository.findAll();
//    }
    
    @Override
    public Balances findByAccount_nr(String account_nr) {
        // TODO Auto-generated method stub
        return balancesRepository.findByAccount_nr(account_nr);
    }
    
    @Override
    public Balances save(Balances balance) {
        // TODO Auto-generated method stub
        return balancesRepository.save(balance);
    }

}
