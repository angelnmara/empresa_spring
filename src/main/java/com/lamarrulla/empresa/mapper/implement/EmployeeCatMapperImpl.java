package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.dto.EmployeeCatDto;
import com.lamarrulla.empresa.entity.EmployeeCat;
import com.lamarrulla.empresa.mapper.IEmployeeCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EmployeeCatMapperImpl implements IEmployeeCatMapper {

    private final PersonalDataMapperImpl personalDataMapper;
    private final RoleCatMapperImpl roleCatMapper;

    public EmployeeCatMapperImpl(PersonalDataMapperImpl personalDataMapper, RoleCatMapperImpl roleCatMapper) {
        this.personalDataMapper = personalDataMapper;
        this.roleCatMapper = roleCatMapper;
    }

    @Override
    public EmployeeCatDto toDTO(EmployeeCat employeeCat) {
        EmployeeCatDto employeeCatDto = new EmployeeCatDto();
        employeeCatDto.setId(employeeCat.getId());
        employeeCatDto.setPersonalDataDto(personalDataMapper.toDTO(employeeCat.getPersonalData()));
        employeeCatDto.setRoleDtoList(roleCatMapper.toDTOList(employeeCat.getRoleCatList()));
        return employeeCatDto;
    }

    @Override
    public EmployeeCat toEntity(EmployeeCatDto employeeCatDto) {
        EmployeeCat employeeCat = new EmployeeCat();
        employeeCat.setId(employeeCatDto.getId());
        employeeCat.setPersonalData(personalDataMapper.toEntity(employeeCatDto.getPersonalDataDto()));
        employeeCat.setRoleCatList(roleCatMapper.toEntityList(employeeCatDto.getRoleDtoList()));
        return employeeCat;
    }

    @Override
    public List<EmployeeCatDto> toDTOList(List<EmployeeCat> employeeCatList) {
        return employeeCatList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
