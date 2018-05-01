package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		// model argument above is basically just a hashmap
		System.out.println("==== sayHello ====");
		// first argument 'greetingMessage' matches with ${greetingMessage} in hello.jsp file
		model.addAttribute("greetingMessage", "Hello World");
		// return value 'hello' must match with name of the jsp file - hello.jsp in this case
		return "hello";
	}

}
