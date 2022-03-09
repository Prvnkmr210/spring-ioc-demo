package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.demo.ioc.Car;

@SpringBootApplication
public class SpringIocDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(SpringIocDemoApplication.class, args);
		Car car = ctxt.getBean(Car.class);
		car.startCar();
	}

}
