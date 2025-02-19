package com.portfolio.marlonSpringboot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class AbstractModel {

	public boolean hasError;

	public String errorMessage;

	public String infoMessage;

	public String fieldErrorName;

	public String fieldErrorValue;
}
