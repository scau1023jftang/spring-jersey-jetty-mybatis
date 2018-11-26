package com.webank.bdp.springbootjersey;

import com.webank.bdp.springbootjersey.api.HelloJersey;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringbootJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootJerseyApplication.class, args);
	}

	@Bean
	public ResourceConfig resourceConfig() {
		ResourceConfig config = new ResourceConfig();
		config.register(HelloJersey.class);
		return config;
	}
}
