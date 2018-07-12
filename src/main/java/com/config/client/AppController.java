package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AppController {

	@Value("${message}")
	private String message;
	
	@Value("${environnment}")
	private String environment;

	@RequestMapping("/message")
	public String getMessage() {
		return this.message + " Environment :: "+ this.environment;
	}
}
