package net.classnotfound.spring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${net.classnotfound.spring.user}")
	private String user;

	@RequestMapping("/")
	public String boot() {
		return "Greetings from Spring Boot to " + user;
	}

}
