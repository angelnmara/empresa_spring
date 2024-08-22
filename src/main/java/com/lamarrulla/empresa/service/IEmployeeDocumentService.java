package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;

import java.util.List;

public interface IEmployeeDocumentService {
    EmployeeDocumentDto findById(Integer id);
    EmployeeDocumentDto save(EmployeeDocumentDto employeeDocumentDto);
    List<EmployeeDocumentDto> findAll();
}
