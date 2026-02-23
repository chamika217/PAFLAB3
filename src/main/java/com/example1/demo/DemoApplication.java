package com.example1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String rootEndpoint() {
		String message="Hello World!";
		return message;
	}
	@GetMapping("/helllo")
	public String rootEndpoint1(){
		String message="Chamika Dissanayake";
		return message;
	}
	@GetMapping("/greet")
	public String rootEndpoint2(){
		String message="WelCome to Spring Boot!";
		return message;
	}
	 
	 @GetMapping("/greet/{name}")
    public String greetPerson(
		@PathVariable String name,
		@RequestParam(required = false) String message )
		{
		if (message== null || message.trim().isEmpty())  {
			return "hello" +name +"!Welcome to Sring Boot!";
		}
		return "Hello, " + name + "!" +message;
	 }


}
    
    

