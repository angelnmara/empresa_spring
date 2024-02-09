package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    EmployeeDto findById(Integer id);
    List<EmployeeDto> findAll();
    EmployeeDto save(EmployeeDto employeeDto);
}
