package com.spring.demo.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	Engine engine;
	
	public void startCar() {
		engine.type();
	}

}
