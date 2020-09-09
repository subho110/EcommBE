package com.exploreTechie.ecommerce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Login")
public class LoginController {

	@GetMapping("/user")
	public String getResponse() {
		System.out.println("inside login control");
		return "in login controller";
	}
	
}
