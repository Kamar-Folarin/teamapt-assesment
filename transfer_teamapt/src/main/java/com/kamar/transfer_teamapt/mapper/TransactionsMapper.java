package com.kamar.transfer_teamapt.mapper;

import com.kamar.transfer_teamapt.dto.TransactionsDTO;
import com.kamar.transfer_teamapt.models.Transactions;

public class TransactionsMapper {
	
	public static Transactions DtoToEntity(TransactionsDTO trs) {
		Transactions transaction = new Transactions();
		transaction.setAmount(trs.getAmount());
		transaction.setAccount_nr(trs.getAccount_nr());
		
		return transaction;
		
      
    }
    public static TransactionsDTO EntityToDto(Transactions trs) {
    	TransactionsDTO transaction = new TransactionsDTO();
    	transaction.setAmount(trs.getAmount());
    	transaction.setAccount_nr(trs.getAccount_nr());
    	
    	return transaction;
    		
    }
}
