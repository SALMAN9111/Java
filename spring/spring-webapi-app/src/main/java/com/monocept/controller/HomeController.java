package com.monocept.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Message;


@RequestMapping("/api/v1/home")
@CrossOrigin
@RestController
public class HomeController {

	@PostMapping(value = "/postMsg")
	public String post(@RequestBody Message m) {
		System.out.println("Post invoked in home controller !");
		return m.getMsg();
	}
}
