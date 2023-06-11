/**
 * 
 */
package com.customer.rewards.calculations.exception;

import java.time.LocalDateTime;

/**
 * @author nitinjain
 *
 */
public class CustomizedExceptionDetails {
	LocalDateTime date;
	String errorMessage;
	String detailedTrace;
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDetailedTrace() {
		return detailedTrace;
	}
	public void setDetailedTrace(String detailedTrace) {
		this.detailedTrace = detailedTrace;
	}
	public CustomizedExceptionDetails(LocalDateTime date, String errorMessage, String detailedTrace) {
		super();
		this.date = date;
		this.errorMessage = errorMessage;
		this.detailedTrace = detailedTrace;
	}

}
