package com.nik.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.microservices.currencyexchangeservice.entity.ExchangeCurrency;

public interface ExchangeCurrencyRepository extends JpaRepository<ExchangeCurrency, Integer> {
	
	ExchangeCurrency findByFromAndTo(String from,String to);

}
