package com.loanapproval.repository;

import com.loanapproval.entity.Loan;
import com.loanapproval.entity.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByStatus(LoanStatus status);
}
