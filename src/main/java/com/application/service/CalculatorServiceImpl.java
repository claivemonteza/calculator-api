package com.application.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	public BigDecimal sum(String x, String y) {
		return new BigDecimal(x).add(new BigDecimal(y));
	}

	public BigDecimal subtract(String x, String y) {
		return new BigDecimal(x).subtract(new BigDecimal(y));
	}

	public BigDecimal multiply(String x, String y) {
		return new BigDecimal(x).multiply(new BigDecimal(y));
	}

	public BigDecimal divide(String x, String y) {
		return new BigDecimal(x).divide(new BigDecimal(y));
	}
}
