package com.example.demo.dtos;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestSuscriptorDTO {
	@Schema(description = "suscriptor name", example = "Evaristo")
	private String nombre;
	@Schema(description = "suscriptor email", example = "Evaristo@gmail.com")
	private String email;
}
