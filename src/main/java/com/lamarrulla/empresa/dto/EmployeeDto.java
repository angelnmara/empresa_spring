package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.RoleCat;
import com.lamarrulla.empresa.vo.EmployeeVO;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDto {
    private Long id;
    private PersonalDataDto personalDataDto;
    private List<RoleCat> roleCat;
}
