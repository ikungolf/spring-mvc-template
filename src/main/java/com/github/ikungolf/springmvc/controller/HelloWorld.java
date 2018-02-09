package com.github.ikungolf.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.ikungolf.springmvc.dao.impl.HelloWorldDaoImpl;
import com.github.ikungolf.springmvc.service.HelloService;

@Controller
public class HelloWorld {

	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

	@Autowired
	private HelloService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView sayHello(ModelAndView model) {
		LOGGER.debug("sayHello");
		model.setViewName("hello");
		return model;
	}
}
