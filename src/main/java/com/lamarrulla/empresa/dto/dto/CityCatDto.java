package com.lamarrulla.empresa.dto.dto;

import lombok.Data;

@Data
public class CityCatDto {
    private Long id;
    private String name;
    private StateCatDto stateDto;
}
