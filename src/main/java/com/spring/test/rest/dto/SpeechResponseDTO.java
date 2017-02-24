package com.spring.test.rest.dto;

public class SpeechResponseDTO {

	private String speech;
	private String displayText;
	private BaseResponseDTO data;

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public BaseResponseDTO getData() {
		return data;
	}

	public void setData(BaseResponseDTO data) {
		this.data = data;
	}

}
