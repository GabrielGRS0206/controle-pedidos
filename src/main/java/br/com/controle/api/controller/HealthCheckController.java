package br.com.controle.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

	@GetMapping
	public ResponseEntity<Object> check() {
		return new ResponseEntity<>("up", HttpStatus.OK);
	}
}
