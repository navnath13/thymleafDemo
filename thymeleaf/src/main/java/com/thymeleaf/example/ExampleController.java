package com.thymeleaf.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ExampleController {
	@GetMapping("/example")
	public String Example() {
		System.out.println("hekii");
		
		return "example";
		
	}

}
