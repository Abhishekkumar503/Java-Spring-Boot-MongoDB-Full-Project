package com.abis.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class JoblistingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);		
	}

}
