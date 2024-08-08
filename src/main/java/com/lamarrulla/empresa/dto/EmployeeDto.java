package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.RoleCat;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDto {
    private Long id;
    private PersonalDataDto personalDataDto;
    private List<RoleCat> roleCat;
}
