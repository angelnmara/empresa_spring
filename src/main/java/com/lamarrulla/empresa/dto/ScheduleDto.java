package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ScheduleDto {
    private Long id;
    private CustomerCatDto customerDto;
    private Date date;
    private String description;
    private EmployeeCatDto employeeDto;
}
