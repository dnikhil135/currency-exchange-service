package com.nik.microservices.currencyexchangeservice.resource;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nik.microservices.currencyexchangeservice.model.ExchangeCurrency;

@RestController
public class CurrencyExchangeResource {

	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeCurrency retriveCurrencyValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeCurrency exchangeCurrency = new ExchangeCurrency(101, from, to, BigDecimal.valueOf(65));
		exchangeCurrency.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeCurrency;
	}
}
