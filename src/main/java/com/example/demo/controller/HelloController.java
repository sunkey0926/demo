package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@GetMapping("/session")
	public ResponseCookieDTO hello(@AuthenticationPrincipal User user, HttpSession HttpSession) {
		String username = "empty";
		String session_id = "empty";

		if (user == null) {
			System.out.println("user is null");
		} else {
			session_id = HttpSession.getId();
			username = user.getUsername();
		}

		return new ResponseCookieDTO(username, session_id);
	}

}
