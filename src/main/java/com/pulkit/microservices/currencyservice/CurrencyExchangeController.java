package com.pulkit.microservices.currencyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pulkit.microservices.currencyservice.bean.ExchangeValue;
import com.pulkit.microservices.currencyservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	@Autowired
	private ExchangeValueRepository repo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue convertCurrency(@PathVariable String from,@PathVariable String to){
		return repo.findyfromAndTo(from, to);
	}
}
