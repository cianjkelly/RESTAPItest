package com.fiserv.merchantmaintenance.exception;


import java.util.UUID;

public class NotAcceptableException extends GenericException  {

	public NotAcceptableException(String title, String description, String errorSource, UUID uniqueIdentifier) {
		super(title, description, uniqueIdentifier, errorSource);
	}
}
