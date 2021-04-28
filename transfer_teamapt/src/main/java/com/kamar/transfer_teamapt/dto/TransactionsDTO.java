package com.kamar.transfer_teamapt.dto;

import com.sun.istack.NotNull;

//@Getter
//@Setter
//@Accessors(chain = true)
//@NoArgsConstructor
public class TransactionsDTO {
	
	@NotNull
	private double amount ;
	
	@NotNull
	private String account_nr;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccount_nr() {
		return account_nr;
	}

	public void setAccount_nr(String account_nr) {
		this.account_nr = account_nr;
	}

	
}
