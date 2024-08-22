package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class EmployeeDocumentDto {
    private Long id;
    EmployeeCatDto employeeDto;
    DocumentCatDto documentDto;
}
