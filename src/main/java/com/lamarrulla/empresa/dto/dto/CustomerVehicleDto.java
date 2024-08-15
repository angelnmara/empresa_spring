package com.lamarrulla.empresa.dto.dto;

import java.util.List;

public class CustomerVehicleDto {
    private Long id;
    private CustomerCatDto customer;
    private VehicleCatDto vehicle;
    private String plate;
    private ColorCatDto colorDto;
    private Integer kilometerAge;
    private Integer chassisNumber;
    private List<String> imageList;
}
