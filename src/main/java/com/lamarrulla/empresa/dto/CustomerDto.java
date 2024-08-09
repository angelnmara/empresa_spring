package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.*;

import java.util.List;

public class CustomerDto {
    private PersonalData personalData;
    private List<AddressCat> addressCatList;
    private TitleCat title;
    private Integer grade;
    private List<VehicleCat> vehicleCatList;
    private List<DocumentsCat> documentsCatList;
}
