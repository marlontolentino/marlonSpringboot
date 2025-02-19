package com.portfolio.marlonSpringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.portfolio.marlonSpringboot.entities.UserData;
import com.portfolio.marlonSpringboot.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserData user = this.userRepository.findByUsername(username);
		if (user != null) {
			UserDetails userDetails = org.springframework.security.core.userdetails.User
					.withUsername(user.getUsername())
					.password(user.getPassword())
					.build();
			return userDetails;
		}
		throw new UsernameNotFoundException(username);
	}
	
}