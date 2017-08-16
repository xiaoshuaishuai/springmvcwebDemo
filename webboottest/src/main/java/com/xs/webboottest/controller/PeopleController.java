package com.xs.webboottest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xs.webboottest.domain.People;
import com.xs.webboottest.repository.IPeopleRepository;

@Controller
public class PeopleController {
	@Autowired
	IPeopleRepository peopleRepository;
	
	@RequestMapping("/list")
	public @ResponseBody List<People> list() {
		List<People> list = peopleRepository.findAll();
		return list;
	}
}
