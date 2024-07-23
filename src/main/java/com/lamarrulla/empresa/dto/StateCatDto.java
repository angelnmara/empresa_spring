package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class StateCatDto {
    private Long id;
    private String stateName;
    private String stateCode;
    private CountryCatDto countryCatDto;
}
