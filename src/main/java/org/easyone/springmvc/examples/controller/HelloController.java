package org.easyone.springmvc.examples.controller;

import org.easyone.springmvc.examples.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {  
	
	@RequestMapping(value = "/hello")
	public ModelAndView sayHello(@RequestParam(defaultValue="world") String name) {
		ModelAndView mav = new ModelAndView();
		HelloService helloService = new HelloService();
		String greet = helloService.greeting(name);
		mav.addObject("message", greet);
		mav.setViewName("hello");
		return mav;
	}
	
}