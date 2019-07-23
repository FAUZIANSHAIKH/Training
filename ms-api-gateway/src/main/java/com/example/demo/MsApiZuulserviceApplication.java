package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MsApiZuulserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiZuulserviceApplication.class, args);
	}
	@Bean
	public SimpleFilter simpleFilter()
	{
		return new SimpleFilter();
	}
}
