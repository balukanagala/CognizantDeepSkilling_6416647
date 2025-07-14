package com.cognizant.orm.learn.Service;

import java.util.List;
import java.util.Optional;

import com.cognizant.orm.learn.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // [cite: 665]
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.orm.learn.model.Country;
import com.cognizant.orm.learn.Repository.CountryRepository;

@Service // [cite: 665]
public class CountryService {

    @Autowired // [cite: 666]
    private CountryRepository countryRepository;

    @Transactional // [cite: 668]
    public List<Country> getAllCountries() { // [cite: 667]
        return countryRepository.findAll(); // [cite: 669]
    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
        Optional<Country> result = countryRepository.findById(countryCode);

        if(!result.isPresent()) throw new CountryNotFoundException();

        Country country = result.get();
        return country;
    }

    @Transactional
    public void addCountry(String countryName, String countryCode){
        Country c = new Country(countryName,countryCode);
        countryRepository.save(c);
    }

}