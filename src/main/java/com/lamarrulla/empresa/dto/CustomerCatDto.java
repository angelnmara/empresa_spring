package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.*;

import java.util.List;

public class CustomerCatDto {
    private PersonalDataDto personalDataDto;
    private List<AddressCatDto> addressDtoList;
    private TitleCatDto titleDto;
    private Integer grade;
    private List<CustomerVehicleDto> customerVehicleDtoList;
    private List<CustomerDocumentsDto> customerDocumentsDtoList;
}
