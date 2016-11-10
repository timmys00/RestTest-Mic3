package com.mic3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mic3.domain.City;
import com.mic3.repo.CitiesRepository;

@Service
public class CityService {
	
	@Autowired
	CitiesRepository citiesRepository;
	
	public List<City> getAllCities() {
		List<City> toReturn = new ArrayList<City>(citiesRepository.findAll().values());
	    return toReturn;
	  }

	public List<City> getCitiesInCountry(String country) {
		List<City> toReturn = new ArrayList<City>(citiesRepository.findSpecific(country).values());
	    return toReturn;
	  }

}
