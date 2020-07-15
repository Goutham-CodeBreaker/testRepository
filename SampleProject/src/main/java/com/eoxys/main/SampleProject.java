package com.eoxys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.eoxys")
public class SampleProject {

	public static void main(String[] args) {
		SpringApplication.run(SampleProject.class, args);
	}
}
