package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.List;
@Data
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
