package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeCatDto {
    private Long id;
    private PersonalDataDto personalDataDto;
    private List<RoleCatDto> roleDtoList;
    private ContactDataDto contactDataDto;
    private CompanyCatDto companyCatDto;
    private List<EmployeeDocumentDto> employeeDocumentDtoList;
}
