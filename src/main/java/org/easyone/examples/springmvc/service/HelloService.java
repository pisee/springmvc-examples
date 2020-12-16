package org.easyone.examples.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String greeting(String name) {
		return "hello, " + name + "!";
	}

}
