package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.CountryCat;
import lombok.Data;

@Data
public class StateCatDto {
    private Long id;
    private String stateName;
    private String stateCode;
    private CountryCat countryCat;
}
