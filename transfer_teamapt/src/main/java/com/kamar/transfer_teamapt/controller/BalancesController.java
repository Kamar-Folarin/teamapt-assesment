package com.kamar.transfer_teamapt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamar.transfer_teamapt.exception.BalancesNotFoundException;
import com.kamar.transfer_teamapt.models.Balances;
import com.kamar.transfer_teamapt.service.BalancesService;



@RestController
@RequestMapping("/api")
public class BalancesController {
	
	//@Autowired
    private BalancesService balancesService;
	
	@GetMapping(value="/balances/{balance}")
    ResponseEntity<Balances> getByReference(@PathVariable("")  String account_nr) {
		Balances balance = balancesService.findByAccount_nr(account_nr);
		
	//	if(balance.getBalance()==0) {
		//	return new BalancesNotFoundException("No Balance available in the  : "+account_nr);
		//}
       // .orElseThrow(()->new BalancesNotFoundException("No Balance available in the  : "+account_nr));
		
        return ResponseEntity.ok().body(balance);
    }
	

}
