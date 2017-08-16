package com.xs.webtest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
 * http://localhost:8080/webtest/hello.htm
 * http://localhost:8080/webtest/hello.htm?name=test
 */

import com.xs.webtest.domain.People;
import com.xs.webtest.service.IPeopleService;
@Controller
public class HelloController {
	@Autowired
	IPeopleService peopleService;
	
	
	@RequestMapping("/hello")
	public ModelAndView greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("Hello " + name);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", name);
		return new ModelAndView("/hello", map);
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		Map<String, List<People>> map = new HashMap<String, List<People>>();
		map.put("lists", peopleService.list());
		System.out.println("HelloController.list()");
		return new ModelAndView("/list", map);
	}

}