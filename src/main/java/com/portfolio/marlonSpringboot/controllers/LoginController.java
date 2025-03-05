package com.portfolio.marlonSpringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.portfolio.marlonSpringboot.services.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@PostMapping("/login")
	public String submit(RedirectAttributes redirect, Model model) {
		userService.loadUserByUsername("marlon");
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
