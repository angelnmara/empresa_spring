package com.lamarrulla.empresa.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class EmployeeVO {
    private String firstName;
    private String lastName;
    private Integer age;
}
