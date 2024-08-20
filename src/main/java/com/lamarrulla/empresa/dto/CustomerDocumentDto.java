package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class CustomerDocumentDto {
    private Long id;
    private CustomerCatDto customerDto;
    private DocumentCatDto documentDto;
    private Boolean mandatory;
}
