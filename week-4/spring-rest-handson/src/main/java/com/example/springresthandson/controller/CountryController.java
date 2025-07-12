package com.example.springresthandson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springresthandson.model.Country;
import com.example.springresthandson.service.CountryService;

import org.springframework.web.bind.annotation.RestController;
@RestController

public class CountryController {
 
    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getDefaultCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/country/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        Country country = countryService.getCountryByCode(code);
        if (country != null) {
            return ResponseEntity.ok(country);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
