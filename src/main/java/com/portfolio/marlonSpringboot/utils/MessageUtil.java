package com.portfolio.marlonSpringboot.utils;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

	@Autowired
	private MessageSource messageSource;

	public String getMessage(String errorCode) {
		return this.messageSource.getMessage(errorCode, null, Locale.ENGLISH);
	}

	public String getMessage(String errorCode, Object[] params) {
		return this.messageSource.getMessage(errorCode, params, Locale.ENGLISH);
	}
}
