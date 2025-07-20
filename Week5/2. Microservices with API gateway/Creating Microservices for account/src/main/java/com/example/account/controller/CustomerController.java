package com.example.account.controller;

import com.example.account.entity.Customer;
import com.example.account.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/account")
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Customer> getAll() { return service.getAll(); }

    @PostMapping("/add")
    public Customer add(@RequestBody Customer entity) { return service.save(entity); }
}
