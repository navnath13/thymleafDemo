package com.thymeleaf.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	
	@RequestMapping(value ="/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("this is the about controller");	//putting add in the model
	    model.addAttribute("name" ,"Navnath doke");
	    model.addAttribute("currentDate",new Date().toLocaleString());
		return "about";
	}
	@RequestMapping(value ="/home", method =  RequestMethod.GET)
	public String home() {
		System.out.println("this is the home controller");
		return "home";
		
	}
	
	@GetMapping("/Exampleloop")
	public String loopExample(Model model) {
		List<String> name = List.of("navnath","vishal","gorakah","sonali");
		model.addAttribute("name", name);
		return "ExampleLoop";
	}
	
	
	//handler for including fragments
	@GetMapping("/Service")
	public String Service(Model model) {
		model.addAttribute("title","This is Navnath");
		model.addAttribute("subtitle" ,LocalDateTime.now().toString() );
		return "Service";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		return "newabout";
	}

}
