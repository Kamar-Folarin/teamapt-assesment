package com.kamar.transfer_teamapt.service;

import java.util.List;
import java.util.Optional;

import com.kamar.transfer_teamapt.models.Transactions;

public interface Itransactions {
	List<Transactions> getAllTransactions();
	Optional<Transactions> findByReference(int reference);
	Transactions save(Transactions reference);

}
