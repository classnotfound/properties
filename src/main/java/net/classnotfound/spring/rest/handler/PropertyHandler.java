package net.classnotfound.spring.rest.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyHandler {

	@Value("${net.classnotfound.spring.user}")
	private String user;

	public String getUser() {
		return user;
	}

}
