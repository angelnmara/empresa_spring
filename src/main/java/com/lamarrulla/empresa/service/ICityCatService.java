package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CityCatDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICityCatService {
    CityCatDto findById(Integer Id);
    List<CityCatDto> findAll();
    CityCatDto save(CityCatDto cityCatDto);
}
