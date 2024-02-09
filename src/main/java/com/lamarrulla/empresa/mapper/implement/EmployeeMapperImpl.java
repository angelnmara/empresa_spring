package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.Employee;
import com.lamarrulla.empresa.mapper.IEmployeeMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EmployeeMapperImpl implements IEmployeeMapper {
    @Override
    public EmployeeDto toDTO(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setRole(employee.getRole());
        return employeeDto;
    }

    @Override
    public Employee toEntity(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setRole(employeeDto.getRole());
        return employee;
    }

    @Override
    public List<EmployeeDto> toDTOList(List<Employee> employeeList) {
        return employeeList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
