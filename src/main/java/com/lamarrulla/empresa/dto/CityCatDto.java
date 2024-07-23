package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class CityCatDto {
    private Long id;
    private String cityName;
    private Long postalCode;
    private StateCatDto stateCatDto;
}
