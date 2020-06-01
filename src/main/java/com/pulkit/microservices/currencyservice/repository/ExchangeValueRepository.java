package com.pulkit.microservices.currencyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.pulkit.microservices.currencyservice.bean.ExchangeValue;
@Service
public interface ExchangeValueRepository extends
			JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);
}
