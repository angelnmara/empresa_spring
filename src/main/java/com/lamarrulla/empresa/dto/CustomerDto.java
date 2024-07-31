package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.*;

import java.util.List;

public class CustomerDto {
    private PersonalData personalData;
    private List<Address> addressList;
    private Title title;
    private Integer grade;
    private List<Vehicle> vehicleList;
    private List<DocumentsCat> documentsCatList;
}
