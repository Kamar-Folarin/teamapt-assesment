package com.kamar.transfer_teamapt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kamar.transfer_teamapt.models.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer > {

	Optional<Transactions> findByReference(int reference);

}
