package com.springcloud.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class currencyExchange {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String currencyFrom;
	
	@Column(name = "currency_to")
	private String currencyTo;
	private BigDecimal conversionMultiple;
	private String environment;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public currencyExchange(Long id, String currency_from, String currency_to, BigDecimal conversionMultiple,
			String environment) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
	}
	public currencyExchange() {
		super();
	}
	@Override
	public String toString() {
		return "currencyExchange [id=" + id + ", currency_from=" + currencyFrom + ", currency_to=" + currencyTo
				+ ", conversionMultiple=" + conversionMultiple + ", environment=" + environment + "]";
	}
	
	
	
}
