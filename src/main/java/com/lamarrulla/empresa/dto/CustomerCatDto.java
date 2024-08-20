package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.List;
@Data
public class CustomerCatDto {
    private Long id;
    private PersonalDataDto personalDataDto;
    private List<AddressCatDto> addressDtoList;
    private TitleCatDto titleDto;
    private Integer grade;
    private List<CustomerVehicleDto> customerVehicleDtoList;
    private List<CustomerDocumentDto> customerDocumentDtoList;
}
