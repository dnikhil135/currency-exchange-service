package com.nik.microservices.currencyexchangeservice.model;

import java.math.BigDecimal;

public class ExchangeCurrency {

	private int id;
	private String from;
	private String to;
	private BigDecimal currencyValue;
	private int port;
	
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
