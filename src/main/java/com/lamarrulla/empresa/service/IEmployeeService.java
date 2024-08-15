package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.dto.EmployeeCatDto;

import java.util.List;

public interface IEmployeeService {
    EmployeeCatDto findById(Integer id);
    List<EmployeeCatDto> findAll();
    EmployeeCatDto save(EmployeeCatDto employeeCatDto);
}
