package com.sharma.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.sharma.springbootdemo"})
@EntityScan(basePackages = "com.sharma.springbootdemo.entity")
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",
		basePackages = "com.sharma.springbootdemo.repository")
@EnableAutoConfiguration
@EnableAsync
@Slf4j
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		log.info("application being to start .....");
		SpringApplication.run(SpringBootDemoApplication.class, args);

	log.info("Application Successfully started ....");
	}
}