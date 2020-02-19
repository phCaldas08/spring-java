package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = { "/hello", "/"} , method = RequestMethod.GET)
	public String helloWorld(Model model) {
		
		model.addAttribute("hello", "Bem vindo ao Spring MVC!");
		return "hello";
	}
	
}
