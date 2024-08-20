package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class ContactDataDto {
    private Long id;
    private Integer phone;
    private Integer cellphone;
    private String email;
}
