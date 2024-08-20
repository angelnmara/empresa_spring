package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.DocumentCatDto;

import java.util.List;

public interface IDocumentCatService {
    DocumentCatDto findById(Integer id);
    DocumentCatDto save(DocumentCatDto documentCatDto);
    List<DocumentCatDto> findAll();
}
