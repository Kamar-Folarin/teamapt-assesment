package com.kamar.transfer_teamapt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kamar.transfer_teamapt.models.Balances;

@Repository
public interface BalancesRepository extends JpaRepository<Balances, String> {

	Balances findByAccount_nr(String account_nr);

}
