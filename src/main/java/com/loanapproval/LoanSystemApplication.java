package com.loanapproval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanSystemApplication.class, args);
		System.out.println("🚀 Loan System Backend is Running...");
	}

}
