package com.portfolio.marlonSpringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@PostMapping("/login")
	public String submit() {
		return "redirect:/home";
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
