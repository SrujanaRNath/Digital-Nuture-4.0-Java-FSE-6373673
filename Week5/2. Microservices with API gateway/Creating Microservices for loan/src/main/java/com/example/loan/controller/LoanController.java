package com.example.loan.controller;

import com.example.loan.entity.Loan;
import com.example.loan.service.LoanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    private final LoanService service;

    public LoanController(LoanService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Loan> getAll() { return service.getAll(); }

    @PostMapping("/add")
    public Loan add(@RequestBody Loan entity) { return service.save(entity); }
}
