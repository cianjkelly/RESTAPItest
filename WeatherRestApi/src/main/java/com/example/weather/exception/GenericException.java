package com.fiserv.merchantmaintenance.exception;

import java.io.Serializable;
import java.util.UUID;

public class GenericException  extends RuntimeException implements Serializable {
	private final String title;
	private final String description;
	private final UUID uniqueIdentifier;
	private final String errorSource;

	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}

	public GenericException(   String title,
							   String description,
							   UUID uniqueIdentifier,
							   String errorSource){
		super();
		this.title = title;
		this.description = description;
		this.uniqueIdentifier = uniqueIdentifier;
		this.errorSource = errorSource;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public UUID getUniqueIdentifier() {
		return uniqueIdentifier;
	}
	public String getErrorSource() {
		return errorSource;
	}
}
