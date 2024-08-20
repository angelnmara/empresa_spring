package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CustomerVehicleDto;

import java.util.List;

public interface ICustomerVehicleService {
    CustomerVehicleDto findById(Integer id);
    CustomerVehicleDto save(CustomerVehicleDto customerVehicleDto);
    List<CustomerVehicleDto> findAll();
}
