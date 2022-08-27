package com.wipro.apple.poc.api.controller;

import com.wipro.apple.poc.api.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("/sum")
	public ResponseEntity<Integer> sum(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.sum(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/product")
	public ResponseEntity<Integer> product(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.product(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/modulo")
	public ResponseEntity<Integer> modulo(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.modulo(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
