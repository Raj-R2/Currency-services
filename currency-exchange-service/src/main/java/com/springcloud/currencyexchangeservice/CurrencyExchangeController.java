package com.springcloud.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyExchangeRepo currencyExchangeRepo;
	
	@GetMapping("/currency-exchange/from/{currency_from}/to/{currency_to}")
	public currencyExchange retriveExchangeValue(@PathVariable String currency_from,@PathVariable String currency_to) {
		String port =environment.getProperty("local.server.port");
		//currencyExchange currencyExchange=currencyExchangeRepo.findBycurrencyFromAndcurrencyTo(currency_from, currency_to);
		currencyExchange currencyExchange=new currencyExchange(1000l,"usd","inr",BigDecimal.valueOf(50),port);
	
		return currencyExchange;
	}
}
