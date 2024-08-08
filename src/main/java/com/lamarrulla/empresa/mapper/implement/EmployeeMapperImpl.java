package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.EmployeeCat;
import com.lamarrulla.empresa.mapper.IEmployeeMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EmployeeMapperImpl implements IEmployeeMapper {

    private final PersonalDataMapperImpl personalDataMapper;

    public EmployeeMapperImpl(PersonalDataMapperImpl personalDataMapper) {
        this.personalDataMapper = personalDataMapper;
    }

    @Override
    public EmployeeDto toDTO(EmployeeCat employeeCat) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employeeCat.getId());
        employeeDto.setPersonalDataDto(personalDataMapper.toDTO(employeeCat.getPersonalData()));
        employeeDto.setRoleCat(employeeCat.getRoleCat());
        return employeeDto;
    }

    @Override
    public EmployeeCat toEntity(EmployeeDto employeeDto) {
        EmployeeCat employeeCat = new EmployeeCat();
        employeeCat.setId(employeeDto.getId());
        employeeCat.setPersonalData(personalDataMapper.toEntity(employeeDto.getPersonalDataDto()));
        employeeCat.setRoleCat(employeeDto.getRoleCat());
        return employeeCat;
    }

    @Override
    public List<EmployeeDto> toDTOList(List<EmployeeCat> employeeCatList) {
        return employeeCatList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
