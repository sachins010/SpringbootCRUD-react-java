package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResurceNotFoundException extends RuntimeException
{
	private static final int serialVersionUID = 1;// runtimeException internally extends serialVersion
	
	public ResurceNotFoundException(String message)
	{
		super(message);
	}

}
