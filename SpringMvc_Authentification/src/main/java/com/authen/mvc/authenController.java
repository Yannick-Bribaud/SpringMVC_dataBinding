package com.authen.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.authen.mvc.model.User;

@Controller
//@RequestMapping(value={"/authenUser"})
public class authenController {

	@GetMapping({"/","/authens"})
	public String SignIn() {
		return "authentification";	
	}
	
	@PostMapping("/authen")
	public String saveUser(User user) {
		System.out.println(user);
		return "reponse";
		
	}
}
