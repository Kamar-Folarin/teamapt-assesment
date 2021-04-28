package com.kamar.transfer_teamapt.service;

import java.util.Optional;

import com.kamar.transfer_teamapt.models.Balances;

public interface Ibalances {
	
	Balances findByAccount_nr(String account_nr);
	Balances save(Balances balance);
}
