package com.spring.test.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SpeechRequestDTO {

	ResultRequestDTO result;

	public ResultRequestDTO getResult() {
		return result;
	}

	public void setResult(ResultRequestDTO result) {
		this.result = result;
	}

}
