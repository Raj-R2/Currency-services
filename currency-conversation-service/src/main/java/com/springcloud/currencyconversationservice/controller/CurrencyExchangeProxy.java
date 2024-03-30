package com.springcloud.currencyconversationservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{currency_from}/to/{currency_to}")
	public CurrencyConversion retriveExchangeValue(@PathVariable String currency_from,@PathVariable String currency_to) ;

}
