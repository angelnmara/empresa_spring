package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.EmployeeCatDto;
import com.lamarrulla.empresa.entity.EmployeeCat;

import java.util.List;

public interface IEmployeeMapper {
    EmployeeCatDto toDTO(EmployeeCat employeeCat);
    EmployeeCat toEntity(EmployeeCatDto employeeCatDto);
    List<EmployeeCatDto> toDTOList(List<EmployeeCat> employeeCatList);
}
