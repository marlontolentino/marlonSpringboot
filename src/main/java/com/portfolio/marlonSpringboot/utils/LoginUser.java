package com.portfolio.marlonSpringboot.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.portfolio.marlonSpringboot.entities.UserData;
import com.portfolio.marlonSpringboot.repositories.UserRepository;

@Component
public class LoginUser {

	@Autowired
	private UserRepository userRepository;

	public String getUsername() {
		Authentication authentication = this.getAuthentication();
		return authentication != null ? authentication.getName() : null;
	}

	Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

	public boolean isAuthenticated() {
		Authentication authentication = this.getAuthentication();
		return authentication != null && authentication.isAuthenticated() && !this.isAnonymous();
	}

	public boolean isAnonymous() {
		Authentication authentication = this.getAuthentication();
		return authentication == null || authentication instanceof AnonymousAuthenticationToken;
	}

	public UserData getUserData() {
		String username = this.getUsername();
		return this.userRepository.findByUsername(username);
	}
}
