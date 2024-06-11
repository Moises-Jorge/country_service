package com.example.country_service.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.country_service.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String name);
}
