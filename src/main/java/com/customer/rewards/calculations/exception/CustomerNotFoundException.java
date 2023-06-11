/**
 * 
 */
package com.customer.rewards.calculations.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author nitinjain
 *
 */

@ResponseStatus(code =HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String excpMessage) {
		super(excpMessage);

	}

}
