package com.kamar.transfer_teamapt.mapper;

import com.kamar.transfer_teamapt.dto.BalancesDTO;
import com.kamar.transfer_teamapt.models.Balances;

public class BalancesMapper {
	
	 public static Balances DtoToEntity(BalancesDTO balance) {
		 Balances balBal  = new Balances();
		 
		 balBal.setBalance(balance.getBalance());
		 balBal.setAccount_nr(balance.getAccount_nr());
		 
		 return balBal;
            
     }
     public static BalancesDTO EntityToDto(Balances balance) {
    	 BalancesDTO balBal = new BalancesDTO();
    	 balBal.setAccount_nr(balance.getAccount_nr());
    	 balBal.setBalance(balance.getBalance());
    	 return balBal;
     }
}
