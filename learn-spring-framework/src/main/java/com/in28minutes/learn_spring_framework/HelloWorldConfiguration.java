package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { };
record Address(String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Gaya3";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	//Spring bean is managing the object of a class
	@Bean
	public Person person() {
		return new Person("Ram",18);
	}
	
	@Bean
	public Address address() {
		return new Address("Nagarjuna Enclave", "Miyapur");
	}
	
	//creating a new Bean by using existing data
	@Bean
	public Person person2methodcall() {
		return new Person(name(),age());
	}
}
