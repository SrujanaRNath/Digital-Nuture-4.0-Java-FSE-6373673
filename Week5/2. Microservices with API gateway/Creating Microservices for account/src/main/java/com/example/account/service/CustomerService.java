package com.example.account.service;

import com.example.account.entity.Customer;
import com.example.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAll() { return repository.findAll(); }
    public Customer save(Customer entity) { return repository.save(entity); }
}
