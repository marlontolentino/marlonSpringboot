package com.portfolio.marlonSpringboot.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2727474026933352011L;

	/** Logged-in username */
	private String username;

	/** Logged-in password */
	private String password;

}
