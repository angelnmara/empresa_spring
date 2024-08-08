package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.EmployeeCat;

import java.util.List;

public interface IEmployeeMapper {
    EmployeeDto toDTO(EmployeeCat employeeCat);
    EmployeeCat toEntity(EmployeeDto employeeDto);
    List<EmployeeDto> toDTOList(List<EmployeeCat> employeeCatList);
}
