package com.spring.test.rest;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.rest.dto.SpeechRequestDTO;
import com.spring.test.rest.dto.SpeechResponseDTO;

@RestController
public class ProfileController {

	@RequestMapping(value="/profile", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SpeechResponseDTO postProfile(@RequestBody SpeechRequestDTO speechRequestDTO) {
		Map profile = speechRequestDTO.getResult().getParameters();
		SpeechResponseDTO speechResponseDTO = new SpeechResponseDTO();
		if(profile.get("id") != null && profile.get("id").equals("1111")) {
			speechResponseDTO.setSpeech("Rajiv Kumar");
		} else {
			speechResponseDTO.setSpeech("Vinay Kumar");
		}
		return speechResponseDTO;
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SpeechResponseDTO getProfile() {
		SpeechResponseDTO speechResponseDTO = new SpeechResponseDTO();
		speechResponseDTO.setSpeech("Rajiv Kumar");
		return speechResponseDTO;
	}
}
