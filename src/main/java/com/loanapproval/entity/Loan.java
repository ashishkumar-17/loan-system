package com.loanapproval.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private double amountRequested;

    @Column(nullable = false)
    private int loanTerm;

    @Column(nullable = false)
    private int creditScore;

    @Column(nullable = false)
    private String fraudCheckStatus;

    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}

