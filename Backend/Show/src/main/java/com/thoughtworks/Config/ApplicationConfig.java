package com.thoughtworks.Config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thoughtworks.response.Response;

@Configuration
@EnableAutoConfiguration
public class ApplicationConfig {

	@Bean
	Response getResponce() {
		return new Response();

	}

}
