/* Name: Sharang Verma
 * Student Number: 300981587
 * Submission Date: March 7, 2021
 * */
package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Spring Boot MVC JPA app is ready...");
	}
}
