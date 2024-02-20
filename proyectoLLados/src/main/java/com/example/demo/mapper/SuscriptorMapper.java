package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dtos.RequestSuscriptorDTO;
import com.example.demo.dtos.ResponseSuscriptorDTO;
import com.example.demo.entity.SuscriptorEntity;

@Mapper(componentModel = "spring")
public interface SuscriptorMapper {
	ResponseSuscriptorDTO toDTO(SuscriptorEntity suscriptor);
	SuscriptorEntity toEntity(RequestSuscriptorDTO suscriptor);
	List<ResponseSuscriptorDTO> toDTO(List<SuscriptorEntity> listaSuscriptors);
}
