package com.example.demo.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class ResponseSuscriptorDTO {
	
	private long id;
	@Schema(description = "suscriptor name", example = "Evaristo")
	private String name;
	@Schema(description = "suscriptor email", example = "Evaristo@gmail.com")
	private String email;
}
