package com.test.sb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSBController {

	@Autowired
	HttpServletRequest request;
	
	@GetMapping("/hello")
	public ResponseEntity<Map<String,Object>> hello(){
		HttpHeaders headers=new HttpHeaders();
		Map<String,Object> response = new HashMap<>();
		
		response.put("Your IP",request.getRemoteAddr());
		response.put("message","All good here!");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(response);
		
		
	}
}
