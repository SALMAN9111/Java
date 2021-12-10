package com.monocept.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.monocept.model.NumberAPiResponseDto;

@RequestMapping("/api/v1")
@CrossOrigin
@RestController
public class NumberController {

	@GetMapping(value = "/user/{number}",produces = "application/json")
	public ResponseEntity<NumberAPiResponseDto> showNumberDetails(@PathVariable int number){
		RestTemplate template = new  RestTemplate();
		ResponseEntity<NumberAPiResponseDto> resp = template.getForEntity("http://numbersapi.com/"+number+"?json",NumberAPiResponseDto.class);
		
		System.out.println(resp.getBody().getText());
		System.out.println(resp.getBody().getNumber());
		System.out.println(resp.getBody().getType());
		System.out.println(resp.getBody().isFound());
		return resp;
		

	}
}
