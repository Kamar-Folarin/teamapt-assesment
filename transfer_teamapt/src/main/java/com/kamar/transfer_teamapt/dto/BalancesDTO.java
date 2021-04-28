package com.kamar.transfer_teamapt.dto;

import com.sun.istack.NotNull;

import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@Getter
//@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class BalancesDTO {
	
	@NotNull
	private double balance;
	
	@NotNull
	//@Min(value = 20)
	private String account_nr;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccount_nr() {
		return account_nr;
	}

	public void setAccount_nr(String account_nr) {
		this.account_nr = account_nr;
	}
	
	
    

}
