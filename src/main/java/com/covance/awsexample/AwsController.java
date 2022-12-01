package com.covance.awsexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@RequestMapping("/")
	public String getHelloAws() {
		return"Hello , Welcome to AWS !";
	}
}
