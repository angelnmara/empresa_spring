package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.DocumentCatDto;
import com.lamarrulla.empresa.entity.DocumentCat;
import com.lamarrulla.empresa.mapper.IDocumentCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class DocumentCatMapperImpl implements IDocumentCatMapper {
    @Override
    public DocumentCat toEntity(DocumentCatDto documentCatDto) {
        DocumentCat documentCat = new DocumentCat();
        documentCat.setId(documentCatDto.getId());
        documentCat.setName(documentCatDto.getName());
        return documentCat;
    }

    @Override
    public DocumentCatDto toDto(DocumentCat documentCat) {
        DocumentCatDto documentCatDto = new DocumentCatDto();
        documentCatDto.setId(documentCat.getId());
        documentCatDto.setName(documentCat.getName());
        return documentCatDto;
    }

    @Override
    public List<DocumentCat> toEntityList(List<DocumentCatDto> documentCatDtoList) {
        return documentCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<DocumentCatDto> toDtoList(List<DocumentCat> documentCatList) {
        return documentCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
