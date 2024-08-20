package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.DocumentCatDto;
import com.lamarrulla.empresa.mapper.implement.DocumentCatMapperImpl;
import com.lamarrulla.empresa.repository.IDocumentCatRepository;
import com.lamarrulla.empresa.service.IDocumentCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocumentCatServiceImpl implements IDocumentCatService {
    private final IDocumentCatRepository iDocumentCatRepository;
    private final DocumentCatMapperImpl documentCatMapper;

    public DocumentCatServiceImpl(IDocumentCatRepository iDocumentCatRepository, DocumentCatMapperImpl documentCatMapper) {
        this.iDocumentCatRepository = iDocumentCatRepository;
        this.documentCatMapper = documentCatMapper;
    }


    @Override
    public DocumentCatDto findById(Integer id) {
        return documentCatMapper.toDto(iDocumentCatRepository.findById(id).get());
    }

    @Override
    public DocumentCatDto save(DocumentCatDto documentCatDto) {
        return documentCatMapper.toDto(iDocumentCatRepository.save(documentCatMapper.toEntity(documentCatDto)));
    }

    @Override
    public List<DocumentCatDto> findAll() {
        return documentCatMapper.toDtoList(iDocumentCatRepository.findAll());
    }
}
