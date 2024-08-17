package com.lamarrulla.empresa.dto;

import java.util.List;

public class GarageCatDto {
    private Long id;
    private String name;
    private List<AddressCatDto> addressDtoList;
    private List<MannagerDto> mannagerDtoList;
    private Integer grade;
    private ContactDataDto contactDataDto;
    private List<GarageDocumentDto> garageDocumentDtoList;
    private List<GarageServiceDto> garageServiceDtoList;
    private List<GarageBudgetDto> garageBudgetDtoList;
    private Integer totalCustomers;
    private Integer newCustomers;
}
