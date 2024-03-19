package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.StateCat;
import lombok.Data;

@Data
public class CityCatDto {
    private Long id;
    private String cityName;
    private Long postalCode;
    private StateCatDto stateCatDto;
}
