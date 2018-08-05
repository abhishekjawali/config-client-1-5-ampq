package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AppController {

	@Value("${message:m}")
	private String message;
	
	@Value("${environnment:e}")
	private String environment;
	
	@Value("${vcap.application.instance_index:-1}")
	private String instanceIndex;

	@RequestMapping("/message")
	public String getMessage() {
		return this.message + " | Environment :: "+ this.environment + "| Instance Index " + instanceIndex;
	}
}
