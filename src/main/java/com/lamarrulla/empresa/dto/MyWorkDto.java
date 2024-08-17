package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.List;
@Data
public class MyWorkDto {
    private Long id;
    private String description;
    private List<EstimateDto> estimateDtoList;
    private Double totalAmount;
    private List<Double> payList;
    private TypePayCatDto typePayDto;
    private StatusWorkCatDto statusWorkCatDto;
}
