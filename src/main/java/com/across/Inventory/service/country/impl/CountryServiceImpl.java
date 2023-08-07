package com.across.inventory.service.country.impl;

import com.across.inventory.model.Country;
import com.across.inventory.repository.CountryRepository;
import com.across.inventory.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }
}
