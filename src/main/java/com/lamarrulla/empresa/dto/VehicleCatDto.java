package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class VehicleCatDto {
    private Long id;
    private BrandCatDto brandDto;
    private ModelCatDto modelCat;
    private Integer year;
}
