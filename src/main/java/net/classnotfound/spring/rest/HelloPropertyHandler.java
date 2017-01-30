package net.classnotfound.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.classnotfound.spring.rest.handler.PropertyHandler;

@RestController
public class HelloPropertyHandler {

	@Autowired
	private PropertyHandler propertyHandler;

	@RequestMapping("/handler")
	public String boot() {
		return "Best wishes from Classnotfound to " + propertyHandler.getUser();
	}

}
