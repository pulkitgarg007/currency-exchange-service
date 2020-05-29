package com.pulkit.microservices.currencyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulkit.microservices.currencyservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends
			JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findyfromAndTo(String from, String to);
}
