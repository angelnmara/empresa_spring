package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class GarageDocumentDto {
    private Long id;
    private GarageCatDto garageDto;
    private DocumentCatDto documentDto;
    private Boolean mandatory;
}
