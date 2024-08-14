package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeCatDto {
    private Long id;
    private PersonalData personalData;
    private List<RoleCatDto> roleDtoList;
    private ContactData contactData;
    private CompanyCat companyCat;
    private List<EmployeeDocumentDto> employeeDocumentDtoList;
}
