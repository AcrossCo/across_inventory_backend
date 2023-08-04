package com.across.inventory.controller;

import com.across.inventory.model.Country;
import com.across.inventory.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */

@Controller
@RequestMapping(path = "api/countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getCountries() {
        List<Country> countries = countryService.getCountries();
        return ResponseEntity.ok(countries);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Country>> getCountryById(@PathVariable int id){
        Optional<Country> country = countryService.getCountryById(id);
        return ResponseEntity.ok(country);
    }
}
