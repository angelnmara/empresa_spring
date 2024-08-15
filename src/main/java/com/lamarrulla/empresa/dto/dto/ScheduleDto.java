package com.lamarrulla.empresa.dto.dto;

import com.lamarrulla.empresa.entity.CustomerCat;
import com.lamarrulla.empresa.entity.EmployeeCat;
import lombok.Data;

import java.util.Date;
@Data
public class ScheduleDto {
    private Long id;
    private CustomerCat customerCat;
    private Date date;
    private String description;
    private EmployeeCat employeeCatAssign;
}
