package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.Employee;

import java.util.List;

public interface IEmployeeMapper {
    EmployeeDto toDTO(Employee employee);
    Employee toEntity(EmployeeDto employeeDto);
    List<EmployeeDto> toDTOList(List<Employee> employeeList);
}
