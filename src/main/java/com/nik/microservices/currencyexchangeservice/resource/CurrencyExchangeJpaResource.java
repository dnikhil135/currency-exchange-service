package com.nik.microservices.currencyexchangeservice.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nik.microservices.currencyexchangeservice.entity.ExchangeCurrency;
import com.nik.microservices.currencyexchangeservice.repository.ExchangeCurrencyRepository;

@RestController
public class CurrencyExchangeJpaResource {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeCurrencyRepository exchangeCurrencyRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/currency-exchange-jpa/from/{from}/to/{to}")
	public ExchangeCurrency retriveCurrencyValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeCurrency exchangeCurrency = exchangeCurrencyRepository.findByFromAndTo(from, to);
		exchangeCurrency.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("===> {}", exchangeCurrency);
		return exchangeCurrency;
	}
}
