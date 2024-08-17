package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;
import com.lamarrulla.empresa.entity.EmployeeDocument;

import java.util.List;

public interface IEmployeeDocumentMapper {
    EmployeeDocument toEntity(EmployeeDocumentDto employeeDocumentDto);
    EmployeeDocumentDto toDto(EmployeeDocument employeeDocument);
    List<EmployeeDocument> toEntityList(List<EmployeeDocumentDto> employeeDocumentDtoList);
    List<EmployeeDocumentDto> toDtoList(List<EmployeeDocument> employeeDocumentList);
}
