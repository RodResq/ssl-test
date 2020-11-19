package com.example.ssl.ssltest.rest;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SslTestController {

	@GetMapping(value = "/test")
	public ResponseEntity<String> test() {
		return ResponseEntity.status(HttpStatus.OK).body(ZonedDateTime.now().toString());
	}
}
