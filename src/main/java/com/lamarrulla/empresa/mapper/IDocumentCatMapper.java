package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.DocumentCatDto;
import com.lamarrulla.empresa.entity.DocumentCat;

import java.util.List;

public interface IDocumentCatMapper {
    DocumentCat toEntity(DocumentCatDto documentCatDto);
    DocumentCatDto toDto(DocumentCat documentCat);
    List<DocumentCat> toEntityList(List<DocumentCatDto> documentCatDtoList);
    List<DocumentCatDto> toDtoList(List<DocumentCat> documentCatList);
}
