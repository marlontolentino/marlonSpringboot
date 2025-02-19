package com.portfolio.marlonSpringboot.constants;

import lombok.Getter;

@Getter
public enum MessageCodes {

	EMAIL_ALREADY_USED("email.already.used"),
	NOT_FOUND_EMAIL("not.found.email"),
	USERNAME_ALREADY_USED("username.already.used"),
	REGISTER_SUCCESS("register.success"),
	EMAIL_SENT("email.sent");

	private final String code;

	MessageCodes(String code) {
		this.code = code;
	}
}
