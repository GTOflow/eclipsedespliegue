package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ResponseSuscriptorDTO;
import com.example.demo.service.SuscriptorService;

@RestController
public class LladosController {
	@Autowired
	private SuscriptorService suscriptorService;
	
	public public ResponseEntity<List<ResponseSuscriptorDTO>> getAllSuscriptors(){
		return ResponseEntity.ok(suscriptorService.getAllSuscriptors());
	}
}
