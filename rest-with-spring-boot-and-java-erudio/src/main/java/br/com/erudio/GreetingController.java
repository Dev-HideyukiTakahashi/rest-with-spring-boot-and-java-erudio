package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String TEMPLATE = "Hello, %s!";
	
	//Mockar incremento de id
	private static final AtomicLong COUNTER = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		return new Greeting(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
	}
}
