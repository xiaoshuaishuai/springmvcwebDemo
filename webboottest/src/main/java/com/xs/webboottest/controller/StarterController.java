package com.xs.webboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.spring.boot.demo.starter.InfoMessageService;

@RestController
public class StarterController {
	@Autowired
	private InfoMessageService infoMessageService;

	@RequestMapping("/msg")
	public String message() {
		return infoMessageService.getName() + "<br/>" + infoMessageService.getAge() + "<br/>"
				+ infoMessageService.getEmail();
	}
}
