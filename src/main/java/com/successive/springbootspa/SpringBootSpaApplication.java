package com.successive.springbootspa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.successive"})
@EnableJpaRepositories(basePackages="com.successive.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.successive.entities")
public class SpringBootSpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpaApplication.class, args);
	}
}
