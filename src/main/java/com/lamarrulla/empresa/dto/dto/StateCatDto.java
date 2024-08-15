package com.lamarrulla.empresa.dto.dto;

import lombok.Data;

@Data
public class StateCatDto {
    private Long id;
    private String name;
    private String code;
    private CountryCatDto countryDto;
}
