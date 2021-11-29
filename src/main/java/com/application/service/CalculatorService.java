package com.application.service;

import java.math.BigDecimal;


public interface CalculatorService {
	
	public BigDecimal sum(String x, String y);
	
	public BigDecimal subtract(String x, String y);
	
	public BigDecimal multiply(String x, String y);
	
	public BigDecimal divide(String x, String y);
}
