package com.hybrid.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BaseResponse {
	
	private int responseCode;
	
	private String message;
	
	@JsonProperty("response_code")
	public int getReponseCode() {
		return responseCode;
	}

	public void setReponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BaseResponse(int responseCode, String message) {
		this.responseCode = responseCode;
		this.message = message;
	}

	public BaseResponse() {
	}
}
