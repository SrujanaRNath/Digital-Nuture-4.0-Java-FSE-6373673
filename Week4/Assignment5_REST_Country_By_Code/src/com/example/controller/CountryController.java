package com.example.controller;

import com.example.model.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/country")
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India"));
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("FR", new Country("FR", "France"));
    }

    @GetMapping
    public Country getCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        Country country = countryMap.get(code.toUpperCase());
        return country != null ? ResponseEntity.ok(country) : ResponseEntity.notFound().build();
    }
}