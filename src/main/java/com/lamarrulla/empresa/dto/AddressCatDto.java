package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class AddressCatDto {
    private Long id;
    private String street;
    private String internalNumber;
    private String externalNumber;
    private CityCatDto cityDto;
    private StateCatDto stateDto;
    private CountryCatDto countryDto;
}
