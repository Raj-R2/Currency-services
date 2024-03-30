package com.springcloud.currencyconversationservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion/from/{currency_from}/to/{currency_to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String currency_from,@PathVariable String currency_to,@PathVariable BigDecimal quantity) {
		
	
		HashMap<String,String> uriVariables=new HashMap();
		uriVariables.put(currency_from, currency_from);
		uriVariables.put(currency_to, currency_to);
		
		ResponseEntity<CurrencyConversion>  responseEntity =new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/usd/to/inr", CurrencyConversion.class,uriVariables);
		
		CurrencyConversion currencyConversion=responseEntity.getBody();
		
		return new CurrencyConversion(currencyConversion.getId(),currency_from,currency_to,currencyConversion.getConversionMultiple(),quantity,quantity.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment());
	}
	
	
	@GetMapping("/currency-conversion-feign/from/{currency_from}/to/{currency_to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionFeign(@PathVariable String currency_from,@PathVariable String currency_to,@PathVariable BigDecimal quantity) {
		
	
		
		
		
		
		CurrencyConversion currencyConversion=proxy.retriveExchangeValue(currency_from, currency_to);
		
		return new CurrencyConversion(currencyConversion.getId(),currency_from,currency_to,currencyConversion.getConversionMultiple(),quantity,quantity.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment());
	}
}
