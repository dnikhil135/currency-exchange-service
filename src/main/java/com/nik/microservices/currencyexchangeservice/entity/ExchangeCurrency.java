package com.nik.microservices.currencyexchangeservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeCurrency {

	@Id
	private int id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal currencyValue;
	private int port;
	
	public ExchangeCurrency() {
	}
	
	public ExchangeCurrency(int id, String from, String to, BigDecimal currencyValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyValue = currencyValue;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
