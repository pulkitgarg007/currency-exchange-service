package com.pulkit.microservices.currencyservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pulkit.microservices.currencyservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue convertCurrency(@PathVariable String from,@PathVariable String to){
		return new ExchangeValue(1000L,from,to,
				BigDecimal.valueOf(65),
				Integer.parseInt(env.getProperty("local.server.port")));
		
	}
}
