package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;
import com.lamarrulla.empresa.entity.EmployeeDocument;
import com.lamarrulla.empresa.mapper.IEmployeeDocumentMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EmployeeDocumentMapperImpl implements IEmployeeDocumentMapper {
    private final DocumentCatMapperImpl documentCatMapper;
    private final EmployeeCatMapperImpl employeeCatMapper;

    public EmployeeDocumentMapperImpl(DocumentCatMapperImpl documentCatMapper, EmployeeCatMapperImpl employeeCatMapper) {
        this.documentCatMapper = documentCatMapper;
        this.employeeCatMapper = employeeCatMapper;
    }

    @Override
    public EmployeeDocument toEntity(EmployeeDocumentDto employeeDocumentDto) {
        EmployeeDocument employeeDocument = new EmployeeDocument();
        employeeDocument.setDocument(documentCatMapper.toEntity(employeeDocumentDto.getDocumentDto()));
        employeeDocument.setEmployee(employeeCatMapper.toEntity(employeeDocumentDto.getEmployeeDto()));
        employeeDocument.setId(employeeDocumentDto.getId());
        return employeeDocument;
    }

    @Override
    public EmployeeDocumentDto toDto(EmployeeDocument employeeDocument) {
        EmployeeDocumentDto employeeDocumentDto = new EmployeeDocumentDto();
        employeeDocumentDto.setDocumentDto(documentCatMapper.toDto(employeeDocument.getDocument()));
        employeeDocumentDto.setEmployeeDto(employeeCatMapper.toDTO(employeeDocument.getEmployee()));
        employeeDocumentDto.setId(employeeDocument.getId());
        return employeeDocumentDto;
    }

    @Override
    public List<EmployeeDocument> toEntityList(List<EmployeeDocumentDto> employeeDocumentDtoList) {
        return employeeDocumentDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDocumentDto> toDtoList(List<EmployeeDocument> employeeDocumentList) {
        return employeeDocumentList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
