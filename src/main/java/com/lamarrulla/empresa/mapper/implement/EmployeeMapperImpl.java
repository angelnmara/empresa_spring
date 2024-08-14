package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.EmployeeCatDto;
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
    public EmployeeCatDto toDTO(EmployeeCat employeeCat) {
        EmployeeCatDto employeeCatDto = new EmployeeCatDto();
        employeeCatDto.setId(employeeCat.getId());
        employeeCatDto.setPersonalDataDto(personalDataMapper.toDTO(employeeCat.getPersonalData()));
        employeeCatDto.setRoleCat(employeeCat.getRoleCat());
        return employeeCatDto;
    }

    @Override
    public EmployeeCat toEntity(EmployeeCatDto employeeCatDto) {
        EmployeeCat employeeCat = new EmployeeCat();
        employeeCat.setId(employeeCatDto.getId());
        employeeCat.setPersonalData(personalDataMapper.toEntity(employeeCatDto.getPersonalDataDto()));
        employeeCat.setRoleCat(employeeCatDto.getRoleCat());
        return employeeCat;
    }

    @Override
    public List<EmployeeCatDto> toDTOList(List<EmployeeCat> employeeCatList) {
        return employeeCatList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
