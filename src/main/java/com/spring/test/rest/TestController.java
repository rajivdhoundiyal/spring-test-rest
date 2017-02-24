package com.spring.test.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("test")
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String getData() {
		return "test";
	}
	
}
