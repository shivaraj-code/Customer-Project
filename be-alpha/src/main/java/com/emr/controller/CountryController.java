package com.emr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emr.dto.CountryRequest;
import com.emr.model.Country;
import com.emr.repository.CountryRepository;
import com.emr.repository.StateRepository;


@RestController
public class CountryController {
	@Autowired
	 StateRepository stateRepository;
	
	@Autowired
	 CountryRepository countryRepository;
	
	
	/*
	 * @RequestMapping("/welcome") public String vijay() { return
	 * "Welcome to My World"; }
	 */
	
	@PostMapping("/createcountry")
	public Country createCountry(@RequestBody CountryRequest request) {
		return countryRepository.save(request.getCountry());
	}
	
	@GetMapping("/findallcountries")
	public List<Country> findAllCountries(){
		return countryRepository.findAll();
	}
	
	@GetMapping("/findallcountries/{country_Id")
	public Country finddbyCountry(@PathVariable Integer country_Id){
		return countryRepository.findById(country_Id);
	}
	
}
