package com.example.springresthandson.service;

import java.util.ArrayList;
import java.util.List;

import com.example.springresthandson.model.Country;
import org.springframework.stereotype.Service;
@Service

public class CountryService {
     private List<Country> countries;

    public CountryService() {
        countries = new ArrayList<>();
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }

    public Country getCountryByCode(String code) {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
