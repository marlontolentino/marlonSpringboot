package com.portfolio.marlonSpringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/testURL")
	public String testURL() {
		return "/testURL";
	}

	@GetMapping
	public String init(HttpServletRequest request) {
		return "redirect:/init";
	}
}
