package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.RequestSuscriptorDTO;
import com.example.demo.dtos.ResponseSuscriptorDTO;
import com.example.demo.entity.SuscriptorEntity;
import com.example.demo.mapper.SuscriptorMapper;
import com.example.demo.repository.SuscriptorRepository;

@Service
public class SuscriptorService {
@Autowired
private SuscriptorRepository suscriptorRepository;
@Autowired
private SuscriptorMapper suscriptorMapper;

public List<ResponseSuscriptorDTO> getAllSuscriptors(){
	return suscriptorMapper.toDTO(suscriptorRepository.findAll());
}

public ResponseSuscriptorDTO createSuscriptor( RequestSuscriptorDTO requestSuscriptorDTO) {
	SuscriptorEntity suscriptorEntity = suscriptorRepository.save(suscriptorMapper.toEntity(requestSuscriptorDTO));
	return suscriptorMapper.toDTO(suscriptorEntity) ;
}
}
