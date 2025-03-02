package com.loanapproval.config;

import com.loanapproval.entity.Loan;
import com.loanapproval.entity.LoanStatus;
import com.loanapproval.entity.Role;
import com.loanapproval.entity.User;
import com.loanapproval.repository.LoanRepository;
import com.loanapproval.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedDatabase(UserRepository userRepo, LoanRepository loanRepo){
        return args -> {
            User user1 = new User(null, "Ashish Kumar", "ashish@example.com", "password123", Role.BORROWER, null);
            User admin = new User(null, "Admin User", "admin@example.com", "admin123", Role.LOAN_OFFICER, null);

            userRepo.saveAll(List.of(user1, admin));

            Loan loan1 = new Loan(null, user1, 50000, 12, 700, "PASSED", LoanStatus.PENDING, null);
            Loan loan2 = new Loan(null, user1, 100000, 24, 650, "FAILED", LoanStatus.REJECTED, null);

            loanRepo.saveAll(List.of(loan1, loan2));

            System.out.println("✅ Dummy Data Inserted Successfully!");
        };
    }
}
