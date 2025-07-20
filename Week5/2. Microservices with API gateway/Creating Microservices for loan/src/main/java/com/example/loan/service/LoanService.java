package com.example.loan.service;

import com.example.loan.entity.Loan;
import com.example.loan.repository.LoanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService {
    private final LoanRepository repository;

    public LoanService(LoanRepository repository) {
        this.repository = repository;
    }

    public List<Loan> getAll() { return repository.findAll(); }
    public Loan save(Loan entity) { return repository.save(entity); }
}
