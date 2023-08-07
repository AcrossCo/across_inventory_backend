package com.across.inventory.service.country;

import com.across.inventory.model.Country;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
public interface CountryService {
    List<Country> getCountries();

    Optional<Country> getCountryById(int id);
}
