package com.lamarrulla.empresa.dto.dto;

import com.lamarrulla.empresa.entity.*;

import java.util.List;

public class CustomerCatDto {
    private PersonalData personalData;
    private List<AddressCatDto> addressDtoList;
    private TitleCat title;
    private Integer grade;
    private List<CustomerVehicleDto> customerVehicleDtoList;
    private List<CustomerDocumentsDto> customerDocumentsDtoList;
}
