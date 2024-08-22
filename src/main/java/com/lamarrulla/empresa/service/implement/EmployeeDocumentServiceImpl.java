package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;
import com.lamarrulla.empresa.mapper.implement.EmployeeDocumentMapperImpl;
import com.lamarrulla.empresa.repository.IEmployeeDocumentRepository;
import com.lamarrulla.empresa.service.IEmployeeDocumentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDocumentServiceImpl implements IEmployeeDocumentService {
    private final IEmployeeDocumentRepository iEmployeeDocumentRepository;
    private final EmployeeDocumentMapperImpl employeeDocumentMapper;

    public EmployeeDocumentServiceImpl(IEmployeeDocumentRepository iEmployeeDocumentRepository, EmployeeDocumentMapperImpl employeeDocumentMapper) {
        this.iEmployeeDocumentRepository = iEmployeeDocumentRepository;
        this.employeeDocumentMapper = employeeDocumentMapper;
    }

    @Override
    public EmployeeDocumentDto findById(Integer id) {
        return employeeDocumentMapper.toDto(iEmployeeDocumentRepository.findById(id).get());
    }

    @Override
    public EmployeeDocumentDto save(EmployeeDocumentDto employeeDocumentDto) {
        return employeeDocumentMapper.toDto(iEmployeeDocumentRepository.save(employeeDocumentMapper.toEntity(employeeDocumentDto)));
    }

    @Override
    public List<EmployeeDocumentDto> findAll() {
        return employeeDocumentMapper.toDtoList(iEmployeeDocumentRepository.findAll());
    }
}
