package com.kamar.transfer_teamapt.controller;

import java.net.URI;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kamar.transfer_teamapt.dto.TransactionsDTO;
import com.kamar.transfer_teamapt.exception.TransactionsNotFoundException;
import com.kamar.transfer_teamapt.mapper.TransactionsMapper;
import com.kamar.transfer_teamapt.models.Transactions;
import com.kamar.transfer_teamapt.service.TransactionsService;

@RestController
@RequestMapping("/api")
public class TransactionsController {
	
	//@Autowired
    private TransactionsService transactionsService;
	
//	@GetMapping(value="/transactions")
//    List<Transactions> getAll(){
//        return transactionsService.getAllTransactions();
//    }
//	
	
	@GetMapping(value="/transactions/{reference}")
    ResponseEntity<Transactions> getByReference(@PathVariable("reference")  int reference) {
		Transactions trs = transactionsService.findByReference(reference)
                                    .orElseThrow(()->new TransactionsNotFoundException("No Transaction with Reference : "+reference));
        return ResponseEntity.ok().body(trs);
    }
	
	@PostMapping(value="/transactions")
    ResponseEntity<?> createTransactions(@Valid @RequestBody TransactionsDTO inprod) {
		Transactions trs      = TransactionsMapper.DtoToEntity(inprod);
		Transactions addedtrs = transactionsService.save(trs);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                        .path("/{reference}")
                                        .buildAndExpand(addedtrs.getReference())
                                        .toUri();
        return ResponseEntity.created(location).build();
    }
	
	@PutMapping(value="/transactions/{reference}")
    ResponseEntity<Transactions> updateTransactions(@PathVariable("reference")  @Min(1) int reference, @Valid @RequestBody TransactionsDTO inprod) {
		Transactions trs = transactionsService.findByReference(reference)
                                    .orElseThrow(()->new TransactionsNotFoundException("No Transaction with Reference : "+reference));
        
		Transactions newtrs = TransactionsMapper.DtoToEntity(inprod);
        newtrs.setReference(trs.getReference());
       transactionsService.save(newtrs);
        return ResponseEntity.ok().body(newtrs);    
    }


}
