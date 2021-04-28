package com.kamar.transfer_teamapt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class TransferTeamaptApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferTeamaptApplication.class, args);
	}

}
