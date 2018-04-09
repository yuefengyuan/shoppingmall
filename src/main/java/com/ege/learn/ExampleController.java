package com.ege.learn;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleController {

	@RequestMapping("/helloworld")
	String getHelloWorld() {
		return "HelloWorld";
	}
}
