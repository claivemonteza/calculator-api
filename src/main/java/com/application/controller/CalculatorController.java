package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.CalculatorDTO;
import com.application.service.CalculatorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping(value = "/sum")
	public ResponseEntity<CalculatorDTO> sum(@RequestParam("x") String x, @RequestParam("y") String y){
		CalculatorDTO cd = new CalculatorDTO(calculatorService.sum(x,y));
		log.info("Sum of value x: {} to y:{}", x, y);
		return ResponseEntity.status(HttpStatus.OK).body(cd);

	}

	@GetMapping(value = "/subtract")
	public ResponseEntity<CalculatorDTO> subtract(@RequestParam("x") String x, @RequestParam("y") String y) {
		CalculatorDTO cd = new CalculatorDTO(calculatorService.subtract(x, y));
		log.info("Subtract a value y: {} on x:{}", y, x);
		return ResponseEntity.status(HttpStatus.OK).body(cd);
	}

	@GetMapping(value = "/multiply")
	public ResponseEntity<CalculatorDTO> multiply(@RequestParam("x") String x, @RequestParam("y") String y) {
		CalculatorDTO cd = new CalculatorDTO(calculatorService.multiply(x, y));
		log.info("Multiply of value x: {} to y:{}", x, y);
		return ResponseEntity.status(HttpStatus.OK).body(cd);
	}

	@GetMapping(value = "/divide")
	public ResponseEntity<CalculatorDTO> divide(@RequestParam("x") String x, @RequestParam("y") String y) {
		CalculatorDTO cd = new CalculatorDTO(calculatorService.divide(x, y));
		log.info("Divide of value y: {} to x:{}", y, x);
		return ResponseEntity.status(HttpStatus.OK).body(cd);
	}
}
