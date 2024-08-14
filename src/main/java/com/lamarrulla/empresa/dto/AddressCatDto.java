package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.CityCat;
import com.lamarrulla.empresa.entity.CountryCat;
import com.lamarrulla.empresa.entity.StateCat;

public class AddressCatDto {
    private Long id;
    private String street;
    private String internalNumber;
    private String externalNumber;
    private CityCat cityCat;
    private StateCat state;
    private CountryCatDto countryDto;
}
